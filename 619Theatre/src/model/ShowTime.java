package model;

public class ShowTime {
	private Movie theMovie;
	private String showTime, date;
	private SeatList listOfSeats;
	
	
	public ShowTime(String time) {
		setShowTime(time);
		//setDate(date);
		listOfSeats = new SeatList();
	}


	public String getShowTime() {
		return showTime;
	}


	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}


	public Movie getMovie() {
		return theMovie;
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

	
	
	
	

}

