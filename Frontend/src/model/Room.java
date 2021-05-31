package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Room {
	private int roomId;
	private ArrayList<ShowTime> showTimes;
	private LocalDateTime date;

	public Room(int ID, LocalDateTime date) {
		setDate(date);
		setRoomId(ID);
		showTimes = new ArrayList<ShowTime>();
	}

	public void createShowTimes() {
		ShowTime showTimeOne = new ShowTime("3:00 PM",
				LocalDateTime.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 15, 0, 0));
		ShowTime showTimeTwo = new ShowTime("7:00 PM",
				LocalDateTime.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 19, 0, 0));
		ShowTime showTimeThree = new ShowTime("9:00 PM",
				LocalDateTime.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth(), 21, 0, 0));

		showTimes.add(showTimeOne);
		showTimes.add(showTimeTwo);
		showTimes.add(showTimeThree);
	}

	public void addMovie(Movie m) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		for (ShowTime i : showTimes) {
			Movie n = m.clone();
			n.setShowTime(dateFormat.format(date));
			i.setMovie(n);
		}
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public ArrayList<ShowTime> getShowTime() {
		return showTimes;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public SeatList searchShowTime(String movie, String time) {
		for (ShowTime i : showTimes) {
			if (i.getMovie().getMovieTitle().equals(movie) && i.getShowTime().equals(time)) {
				return i.getListOfSeats();
			}

		}
		return null;
	}

	public ShowTime returnShowTime(String movie, String time) {
		for (ShowTime i : showTimes) {
			if (i.getMovie().getMovieTitle().equals(movie) && i.getShowTime().equals(time)) {
				return i;
			}

		}
		return null;
	}

}
