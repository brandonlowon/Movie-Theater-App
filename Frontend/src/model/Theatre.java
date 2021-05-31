package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Theatre {
	private String theatreName, address;
	private int theatreID;
	private MovieList listOfMovies;
	private ArrayList<Room> listOfRoom;
	private UpcomingMovieList upcomingMovies;

	public Theatre(int ID, String name, String address) {
		setUpcomingMovies(new UpcomingMovieList());
		setTheatreName(name);
		setTheatreID(ID);
		setAddress(address);
		setListOfMovies(new MovieList());
		setListOfRoom(new ArrayList<Room>());
	}

	public void tooString() {
		System.out.println(getTheatreID() + getAddress() + getTheatreName());
	}

	public void createRooms() {
		LocalDateTime now = LocalDateTime.now();

		Room roomOne = new Room(1, now);
		Room roomTwo = new Room(2, now);
		Room roomThree = new Room(3, now.plusDays(6));
		Room roomFour = new Room(4, now.plusDays(30));
		listOfRoom.add(roomOne);
		listOfRoom.add(roomTwo);
		listOfRoom.add(roomThree);
		listOfRoom.add(roomFour);
	}

	public void createShowTimes() {
		for (Room i : listOfRoom) {
			i.createShowTimes();
		}

	}

	public void populateUpcomingMovies() {
		upcomingMovies.addMovie(listOfMovies.getMovieList().get(0));
		upcomingMovies.addMovie(listOfMovies.getMovieList().get(7));
		upcomingMovies.addMovie(listOfMovies.getMovieList().get(1));
		upcomingMovies.addMovie(listOfMovies.getMovieList().get(4));
	}

	public SeatList findShowTime(String movie, String time) {
		for (Room i : listOfRoom) {
			if (i.searchShowTime(movie, time) != null) {
				return i.searchShowTime(movie, time);
			}
		}
		return null;
	}

	public ShowTime returnShowTime(String movie, String time) {
		for (Room i : listOfRoom) {
			if (i.searchShowTime(movie, time) != null) {
				return i.returnShowTime(movie, time);
			}
		}
		return null;
	}

	public String toString() {
		return "Theatre ID: " + getTheatreID() + "\n" + "Address: " + getAddress() + "\n" + "Theatre Name: "
				+ getTheatreName();
	}

	public void insertMovies() {
		listOfRoom.get(0).addMovie(listOfMovies.getMovieList().get(6));
		listOfRoom.get(1).addMovie(listOfMovies.getMovieList().get(2));
		listOfRoom.get(2).addMovie(listOfMovies.getMovieList().get(3));
		listOfRoom.get(3).addMovie(listOfMovies.getMovieList().get(7));
	}
	
	// GETTERS
	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public int getTheatreID() {
		return theatreID;
	}

	public void setTheatreID(int theatreID) {
		this.theatreID = theatreID;
	}

	public MovieList getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(MovieList listOfMovies) {
		this.listOfMovies = listOfMovies;
	}

	public ArrayList<Room> getListOfRoom() {
		return listOfRoom;
	}

	public void setListOfRoom(ArrayList<Room> listOfRoom) {
		this.listOfRoom = listOfRoom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UpcomingMovieList getUpcomingMovies() {
		return upcomingMovies;
	}

	public void setUpcomingMovies(UpcomingMovieList upcomingMovies) {
		this.upcomingMovies = upcomingMovies;
	}

}
