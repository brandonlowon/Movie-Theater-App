package model;

import java.util.ArrayList;

public class SeatList {
	private ArrayList<Seat> seatList;
	
	public SeatList(){
		seatList = new ArrayList<Seat>();
	}
	
//	public void populateSeats() {
//		int row = 4;
//		int col =4;
//		int chair = 0;
//		for(int i = 0; i<row; i++) {
//			for(int j = 0; i<col; j++) {
//				Seat temp = new Seat(i,j,chair);
//				seatList.add(temp);
//			}
//		}
//	}
	
	public Seat findSeat(int r, int c) {
		Seat temp = new Seat(r,c,0);
		
		for(Seat i : seatList) {
			if(i.getRowNumber() == temp.getRowNumber() || i.getColumnNumber() == temp.getColumnNumber()) {
				return i;
			}
		}
		System.out.println("Sorry there is no selected seat");
		return null;
		
	}

	public ArrayList<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(ArrayList<Seat> seatList) {
		this.seatList = seatList;
	}

}
