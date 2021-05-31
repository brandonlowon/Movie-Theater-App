package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import users.Ticket;

public class ShowTime {
	private Movie theMovie;
	private String time, date;
	private LocalDateTime dateTime;
	private SeatList listOfSeats;
	private ArrayList<Ticket> list;

	public ShowTime(String time, LocalDateTime date) {
		setShowTime(time);
		setDateTime(date);
		listOfSeats = new SeatList();
	}

	public String getShowTime() {
		return time;
	}

	public void setShowTime(String showTime) {
		this.time = showTime;
	}

	public Movie getMovie() {
		return theMovie;
	}

	public void createTicketList() {
		list = new ArrayList<Ticket>();
		for (Seat st : listOfSeats.getSeatList()) {
			Ticket t = new Ticket(10, st.getSeatNumber(), st.getRowNumber(), st.getColumnNumber(),
					theMovie.getMovieTitle(), getShowTime(), theMovie.getRoomID(), theMovie.getTheatre(), theMovie.getShowTime());
			list.add(t);
		}
	}

	public ArrayList<Ticket> retrieveTickets(ArrayList<Integer> array) {
		ArrayList<Ticket> temp = new ArrayList<Ticket>();

		for (Ticket i : list) {
			for (int j : array) {
				if (i.getSeatNumber() == j) {
					temp.add(i);
				}
			}
		}
		return temp;
	}

	public void setMovie(Movie m) {
		this.theMovie = m;
	}

	public SeatList getListOfSeats() {
		return listOfSeats;
	}

	public void setListOfSeats(SeatList listOfSeats) {
		this.listOfSeats = listOfSeats;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return Movie return the theMovie
	 */
	public Movie getTheMovie() {
		return theMovie;
	}

	/**
	 * @param theMovie the theMovie to set
	 */
	public void setTheMovie(Movie theMovie) {
		this.theMovie = theMovie;
	}

	/**
	 * @return LocalDateTime return the dateTime
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public ArrayList<Ticket> getList() {
		return list;
	}

	public void setList(ArrayList<Ticket> list) {
		this.list = list;
	}

}
