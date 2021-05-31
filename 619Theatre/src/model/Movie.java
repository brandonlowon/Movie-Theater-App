package model;

import java.util.ArrayList;

public class Movie {
	private String movieTitle, showTime, movieRating, theatre;
	private int roomID;
	private int runTime;
	private SeatList seats;
	private ArrayList<Ticket> ticketList;
	
	///
	//public Movie(int ID, String title, String time, String rating, String theatre) {
	//	
	//}
	
	
	
	public Movie(String title, String movieRating, int runTime) {
		setMovieTitle(title);
		setMovieRating(movieRating);
		setRunTime(runTime);
	}

	@Override
	public String toString() {
		System.out.println(movieTitle + " " + showTime + " " + runTime);
		return "";
	}
	
	

	public String getMovieTitle() {
		return movieTitle;
	}


	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}


	public String getShowTime() {
		return showTime;
	}


	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}


	public String getMovieRating() {
		return movieRating;
	}


	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}


	public String getTheatre() {
		return theatre;
	}


	public void setTheatre(String theatre) {
		this.theatre = theatre;
	}


	public int getRoomID() {
		return roomID;
	}


	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}


	public SeatList getSeats() {
		return seats;
	}


	public void setSeats(SeatList seats) {
		this.seats = seats;
	}


	public ArrayList<Ticket> getTicketList() {
		return ticketList;
	}


	public void setTicketList(ArrayList<Ticket> ticketList) {
		this.ticketList = ticketList;
	}



	public int getRunTime() {
		return runTime;
	}



	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}



}
