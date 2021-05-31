package users;
import java.lang.Math; 

public class Ticket {

    private int ticketId;
    private double price;
    private int seatNumber;
    private int rowNumber;
    private int columnNumber;
    private String movieTitle;
    private String showTime;
    private int roomId;
    private String theatre;
    
    private String purchaseDate;
    

    /**
     * default constructor that sets all the fields to default configurations
     */
    public Ticket(double price, int seatNumber, int rowNumber, int columnNumber, String movieTitle, String showTime,int roomId,String theatre, String purchaseDate){
        ticketId = (int)(Math.random()*100000);
        //System.out.println(ticketId);
        this.price= price;
        this.seatNumber = seatNumber;
        this.rowNumber=rowNumber;
        this.columnNumber = columnNumber;
        this.movieTitle=movieTitle;
        this.showTime = showTime;
        this.roomId=roomId;
        this.theatre=theatre;
        this.purchaseDate = purchaseDate;
    }

    public Ticket(){
        ticketId = (int)(Math.random()*100000);
    }
	

    @Override
    public String toString(){
        String s = "";
        s += "Ticket Id: "+ Integer.toString(ticketId) + "\n";
        s += "Theatre: " + theatre + "\n";
        s += "Movie Title: "+ movieTitle + "\n";
        s += "Show Time: "+ showTime + "\n";
        s += "Theatre: " + theatre + "\n";
        s += "Room Id: "+ Integer.toString(roomId)+  "\n";
        s += "Seat Number: "+Integer.toString(seatNumber)+ "\n";
        s += "Row Number: "+Integer.toString(rowNumber)+ "\n";
        s += "Column Number: "+Integer.toString(columnNumber)+ "\n";
        s += "Price: " + Double.toString(price)+ "\n";
        return s;
    }
    /**
     * @return int return the ticketId
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * @param ticketId the ticketId to set
     */
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return int return the seatNumber
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * @param seatNumber the seatNumber to set
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * @return int return the rowNumber
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * @param rowNumber the rowNumber to set
     */
    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * @return int return the columnNumber
     */
    public int getColumnNumber() {
        return columnNumber;
    }

    /**
     * @param columnNumber the columnNumber to set
     */
    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    /**
     * @return String return the movieTitle
     */
    public String getMovieTitle() {
        return movieTitle;
    }

    /**
     * @param movieTitle the movieTitle to set
     */
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    /**
     * @return String return the showTime
     */
    public String getShowTime() {
        return showTime;
    }

    /**
     * @param showTime the showTime to set
     */
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    /**
     * @return int return the roomId
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    /**
     * @return String return the theatre
     */
    public String getTheatre() {
        return theatre;
    }

    /**
     * @param theatre the theatre to set
     */
    public void setTheatre(String theatre) {
        this.theatre = theatre;
    }

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}
