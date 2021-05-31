package model;

import database.DatabaseManager;

public class App {
	private DatabaseManager fileCreate;
	private TheatreList listOfTheatres;
	// private UserList listOfUser;

	public App() {
		fileCreate = new DatabaseManager();
		listOfTheatres = new TheatreList();
		loadFromDB();

	}

	public void loadFromDB() {
		listOfTheatres.setTheatreList(fileCreate.loadTheaters());
		System.out.println("Completed");
		for (Theatre i : listOfTheatres.getTheatreList()) {
			i.getListOfMovies().setMovieList(fileCreate.loadMovies());
			i.createRooms();
			System.out.println("Here are the movies!");
			i.createShowTimes();
			i.insertMovies();
			for (Room j : i.getListOfRoom()) {
				for (ShowTime k : j.getShowTime()) {
					k.getListOfSeats().setSeatList(fileCreate.loadSeats());
					System.out.println("Loaded");
				}
			}
		}
	}

	public static void main(String[] args) {
		App app = new App();

	}

}
