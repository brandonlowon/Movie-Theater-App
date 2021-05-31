package model;


public class Seat {
	private int rowNumber, columnNumber, seatNumber;
	
	public Seat(int seatNum, int rowNum, int colNum) {
		setSeatNumber(seatNum);
		setRowNumber(rowNum);
		setColumnNumber(colNum);
		
		
		
	}
	
	//------------------------------------------
	//GETTERS AND SETTERS
	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public int getColumnNumber() {
		return columnNumber;
	}

	public void setColumnNumber(int columnNumber) {
		this.columnNumber = columnNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

}
