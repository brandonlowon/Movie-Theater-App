package model;

import java.util.ArrayList;

public class Room {
	private int roomId;
	private ArrayList<ShowTime> showTimes;
	private String date;
	public Room(int ID, String date) {
		setDate(date);
		setRoomId(ID);
		showTimes = new ArrayList<ShowTime>();
	}

	public void createShowTimes(){
		ShowTime showTimeOne = new ShowTime("3:00 pm");
		ShowTime showTimeTwo = new ShowTime("7:00 pm");
		ShowTime showTimeThree = new ShowTime("9:00 pm");
		
		
		showTimes.add(showTimeOne);
		showTimes.add(showTimeTwo);
		showTimes.add(showTimeThree);
	}
	
	public void addMovie(Movie m) {
		for(ShowTime i : showTimes) {
			i.setMovie(m);
			System.out.println(m.toString());
		}		
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}


	public ArrayList<ShowTime> getShowTime(){
		return showTimes;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	


}
