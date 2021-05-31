package model;

import java.util.ArrayList;

public class SeatList {
	private ArrayList<Seat> seatList;
	private boolean isBooked = false;
	private int seatCounter = 0;
	private int advancedBooked = 0;

	public SeatList() {
		seatList = new ArrayList<Seat>();
	}

	public ArrayList<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(ArrayList<Seat> seatList) {
		this.seatList = seatList;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public int getSeatCounter() {
		return seatCounter;
	}

	public void setSeatCounter(int seatCounter) {
		this.seatCounter = seatCounter;
	}

	public ArrayList<Integer> findBookedSeats() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (Seat i : seatList) {
			if (i.isBooked()) {
				array.add(i.getSeatNumber());
			}
		}
		return array;
	}

	public boolean purchaseAdvancedSeat(ArrayList<Integer> array) {
		for (Seat i : seatList) {
			// Advanced booking
			for (int j : array) {
				if (j == i.getSeatNumber()) {
					i.setBooked(true);
					advancedBooked++;
				}
			}
		}
		return true;
	}

	public boolean purchaseSeat(ArrayList<Integer> array) {
		for (Seat i : seatList) {
			// Advanced booking
			for (int j : array) {
				if (j == i.getSeatNumber()) {
					i.setBooked(true);
				}
			}
		}
		return true;
	}

	public void refundAdvancedSeat(int seatNumber) {
		for (Seat i : seatList) {
			if (seatNumber == i.getSeatNumber()) {
				i.setBooked(false);
				advancedBooked--;
			}
		}
	}

	public void refundPurchaseSeat(int seatNumber) {
		for (Seat i : seatList) {
			if (seatNumber == i.getSeatNumber()) {
				i.setBooked(false);
			}
		}
	}

}