package model;

import java.util.ArrayList;

public class MovieList {

	private ArrayList<Movie> movieList;

	public MovieList() {
		
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
	
	public String toString() {
		for(Movie i: movieList) {
			System.out.println(i.toString());
		}
		return null;	
	}
}
