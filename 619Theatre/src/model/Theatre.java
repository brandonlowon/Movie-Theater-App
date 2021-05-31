package model;

import java.util.ArrayList;

public class Theatre {
	private String theatreName, address;
	private int theatreID;
	private MovieList listOfMovies;
	private ArrayList<Room> listOfRoom;

	public Theatre(int ID, String name, String address) {
		setTheatreName(name);
		setTheatreID(ID);
		setAddress(address);
		setListOfMovies(new MovieList());
		setListOfRoom(new ArrayList<Room>());
	}

	public void addSeat(Seat s) {

	}

	public void removeSeat(Seat s) {

	}

	public void tooString() {
		System.out.println(getTheatreID() + getAddress() + getTheatreName());
	}

	public void createRooms() {
		Room roomOne = new Room(1,"Today");
		Room roomTwo = new Room(2,"Today");
		Room roomThree = new Room(3, "December 5");
		Room roomFour = new Room(4, "December 10");
		listOfRoom.add(roomOne);
		listOfRoom.add(roomTwo);
		listOfRoom.add(roomThree);
		listOfRoom.add(roomFour);
	}
		

	public void createShowTimes() {
		for(Room i : listOfRoom) {
			i.createShowTimes();
		}

	}
	
	public void insertMovies() {
		listOfRoom.get(0).addMovie(listOfMovies.getMovieList().get(6));
		listOfRoom.get(1).addMovie(listOfMovies.getMovieList().get(2));
		listOfRoom.get(2).addMovie(listOfMovies.getMovieList().get(3));
		listOfRoom.get(3).addMovie(listOfMovies.getMovieList().get(5));
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

}
