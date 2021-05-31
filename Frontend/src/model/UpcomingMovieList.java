package model;

import java.util.ArrayList;

public class UpcomingMovieList {

	private ArrayList<Movie> movieList;

	public UpcomingMovieList() {
		movieList = new ArrayList<Movie>();
	}

	public void addMovie(Movie m) {
		movieList.add(m);
	}

	public void removieMovie(Movie m) {
		movieList.remove(m);
	}

	public ArrayList<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(ArrayList<Movie> movieList) {
		this.movieList = movieList;
	}

	public Movie searchUpcomingMovie(String movieName) {
		for (Movie i : movieList) {
			if (i.getMovieTitle().equals(movieName)) {
				return i;
			}
		}
		return null;
	}

	public String toString() {
		for (Movie i : movieList) {
			System.out.println(i.toString());
		}
		return null;
	}
}
