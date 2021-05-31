package model;

import java.util.ArrayList;

public class TheatreList {
	private ArrayList<Theatre> theatres;

	public TheatreList() {
		theatres = new ArrayList<Theatre>();

	}
	//-----------------------------------------------------
	// SEARCH THEATRE
	public Theatre searchTheatre(String name) {
		for (Theatre i : theatres) {
			if (i.getTheatreName() == name) {
				return i;
			}
		}
		System.out.println("Sorry the name could not be found");
		return null;
	}

	public Theatre searchTheatre(int ID) {
		for (Theatre i : theatres) {
			if (i.getTheatreID() == ID) {
				return i;
			}
		}
		System.out.println("Sorry the name could not be found");
		return null;
	}

	//-------------------------------------------------------------
	public void addTheatre(Theatre t) {
		theatres.add(t);
	}
	
	public void setTheatreList(ArrayList<Theatre> list) {
		theatres = list;
		
	}
	
	public ArrayList<Theatre> getTheatreList(){
		return theatres;
		
	}
}
