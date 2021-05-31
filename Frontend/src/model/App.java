package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import database.DatabaseManager;
import users.GuestUser;
import users.RegisteredUser;
import users.Ticket;
import users.User;
import users.UserList;
import users.Voucher;
import viewcontrollers.GUIController;

public class App {
	private DatabaseManager fileCreate;
	private TheatreList listOfTheatres;
	private GUIController guiControl;
	private UpcomingMovieList upcomingMovies;
	private UserList listOfUsers;
	private User currentUser;
	private Theatre selectedTheatre;
	private int numberBought;
	private GuestUser guestUser;

	public App() {
		fileCreate = new DatabaseManager();
		listOfTheatres = new TheatreList();
		upcomingMovies = new UpcomingMovieList();
		loadFromDB();

		guiControl = new GUIController();
		guiControl.setApp(this);
		setGuestUser(new GuestUser("guest"));

	}

	public void loadFromDB() {
		listOfTheatres.setTheatreList(fileCreate.loadTheatres());
		setListOfUsers(new UserList(fileCreate.loadUsers()));
		System.out.println("Users Loaded");
		System.out.println("Theatres Loaded");

		for (Theatre i : listOfTheatres.getTheatreList()) {
			i.getListOfMovies().setMovieList(fileCreate.loadMovies());
			i.createRooms();
			i.createShowTimes();
			i.insertMovies();
			i.populateUpcomingMovies();

			for (Room j : i.getListOfRoom()) {
				for (ShowTime k : j.getShowTime()) {
					k.getListOfSeats().setSeatList(fileCreate.loadSeats());
					k.createTicketList();

				}
			}
		}
		upcomingMovies.setMovieList(listOfTheatres.getTheatreList().get(0).getUpcomingMovies().getMovieList());

	}

	public void findTheatre(String theatre) {
		selectedTheatre = listOfTheatres.searchTheatre(theatre);
	}

	public boolean searchUpcomingMoviesList(String movie) {
		for (Movie i : selectedTheatre.getUpcomingMovies().getMovieList()) {
			if (i.getMovieTitle().equals(movie)) {
				return true;
			}
		}
		return false;

	}

	public void addUser(String str) {
		String[] results = str.split(";");
		listOfUsers.addUser(
				new RegisteredUser(-1, results[3], results[0], results[4], Long.parseLong(results[1]), results[2]));
	}

	public boolean searchUserLogin(String userInfo) {
		String[] results = userInfo.split(";");
		currentUser = listOfUsers.findUser(results[0], results[1]);

		if (currentUser instanceof RegisteredUser) {
			((RegisteredUser) currentUser).paySubscriptionFee();

		}
		if (currentUser != null) {
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Integer> retrieveSeatList(String body) {
		String results[] = body.split("&");
		ArrayList<Integer> seatsBookeds = selectedTheatre.findShowTime(results[0], results[1]).findBookedSeats();
		return seatsBookeds;
	}

	/**
	 * processSeats should set the seats in the searched seat list to booked when
	 * called
	 * 
	 * @param body         is the string of the movie and show time, in each theatre
	 *                     all rooms play different movies at different show times.
	 * @param array        is the int array of SEATIDs of the seats being booked by
	 *                     the user.
	 * @param body2
	 * @param voucherArray
	 */
	public void processSeats(String movieTime, ArrayList<Integer> array, ArrayList<String> voucherArray,
			String clientInfo) {
		String results[] = movieTime.split("&");
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime roomDate = LocalDateTime.now();
		numberBought = array.size(); // number of tickets bought

		String info[] = clientInfo.split(";");

		// Search all the rooms in the selected theatre for the showtimes
		for (Room i : selectedTheatre.getListOfRoom()) {
			for (int x = 0; x < i.getShowTime().size(); x++)
				// Search all show times for the movie ID and show time to be equal to our
				// requested string
				if (results[1].equals(i.getShowTime().get(x).getShowTime())
						&& results[0].equals(i.getShowTime().get(x).getMovie().getMovieTitle())) {
					roomDate = i.getDate();
				}
		}

		if (roomDate.isAfter(now.plusDays(20))) {
			selectedTheatre.findShowTime(results[0], results[1]).purchaseAdvancedSeat(array);

		} else {
			selectedTheatre.findShowTime(results[0], results[1]).purchaseSeat(array);
		}

		System.out.println(currentUser.purchaseTicket(voucherArray,
				selectedTheatre.returnShowTime(results[0], results[1]).retrieveTickets(array),
				Long.parseLong(info[2])));
	}

	public void processRefund(Ticket refund) {
		int seatNumber = refund.getSeatNumber();
		String movie = refund.getMovieTitle();
		String time = refund.getShowTime();
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime roomDate = LocalDateTime.now();

		for (Room i : selectedTheatre.getListOfRoom()) {
			for (int x = 0; x < i.getShowTime().size(); x++)
				// Search all show times for the movie ID and show time to be equal to our
				// requested string
				if (time.equals(i.getShowTime().get(x).getShowTime())
						&& movie.equals(i.getShowTime().get(x).getMovie().getMovieTitle())) {
					roomDate = i.getDate();
				}
		}

		if (roomDate.isAfter(now.plusDays(20))) {
			selectedTheatre.findShowTime(movie, time).refundAdvancedSeat(seatNumber);

		} else {
			selectedTheatre.findShowTime(movie, time).refundPurchaseSeat(seatNumber);

		}

	}

	public void getDollarAmount(ArrayList<Integer> array) {
		numberBought = array.size();
	}

	public static void main(String[] args) {
		new App();
	}

	// ---------------------------------------------------------------------
	// GETTERS AND SETTERS
	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public UpcomingMovieList getUpcomingMovies() {
		return upcomingMovies;
	}

	public void setUpcomingMovies(UpcomingMovieList upcomingMovies) {
		this.upcomingMovies = upcomingMovies;
	}

	public UserList getListOfUsers() {
		return listOfUsers;
	}

	public void setListOfUsers(UserList listOfUsers) {
		this.listOfUsers = listOfUsers;
	}

	public TheatreList getListOfTheatres() {
		return listOfTheatres;
	}

	public int getNumberBought() {
		return numberBought;
	}

	public void setNumberBought(int numberBought) {
		this.numberBought = numberBought;
	}

	public GuestUser getGuestUser() {
		return guestUser;
	}

	public void setGuestUser(GuestUser guestUser) {
		this.guestUser = guestUser;
	}

}
