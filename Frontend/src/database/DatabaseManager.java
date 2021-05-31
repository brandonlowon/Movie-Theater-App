package database;
import model.Movie;
import model.Seat;
import model.Theatre;
import users.User;
import users.RegisteredUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseManager {

    /**
     * The Jdbc connection.
     */
    public Connection jdbc_connection;
    /**
     * The Statement.
     */
    public Statement statement;
    /**
     * The Database name.
     */
    public String databaseName = "InventoryDB"; /**

    /**
     * The Connection info.
     */
    public String connectionInfo = "jdbc:mysql://localhost:3306/theater",
    /**
     * The Login.
     */
    login          = "root",
    /**
     * The Password.
     */
    password       = "2744568";

    /**
     * Instantiates a new Inventory manager.
     */
    public DatabaseManager()
    {
        try{
            // If this throws an error, make sure you have added the mySQL connector JAR to the project
            Class.forName("com.mysql.cj.jdbc.Driver");
            // If this fails make sure your connectionInfo and login/password are correct
            jdbc_connection = DriverManager.getConnection(connectionInfo, login, password);
            System.out.println("Connected to: " + connectionInfo + "\n");
        }
        catch(SQLException e) { e.printStackTrace(); }
        catch(Exception e) { e.printStackTrace(); }
    }


    public ArrayList<Movie> loadMovies() {

        try {
            String query = "SELECT * FROM MOVIE";
            PreparedStatement pStat = jdbc_connection.prepareStatement(query);
            ArrayList<Movie> movieList = new ArrayList<Movie>();
            String movieTitle;
            String movieRating;
            int runTime;
            ResultSet rs = pStat.executeQuery();
            while (rs.next()) {
                movieTitle = rs.getString("movieTitle");
                movieRating = rs.getString("movieRating");
                runTime = rs.getInt("runTime");
                Movie newMovie = new Movie(movieTitle, movieRating, runTime);
                movieList.add(newMovie);
            }
            pStat.close();
            return movieList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Seat> loadSeats() {
        try {
            String query = "SELECT * FROM SEAT";
            PreparedStatement pStat = jdbc_connection.prepareStatement(query);
            ArrayList<Seat> seatList = new ArrayList<Seat>();
            int seatNumber;
            int rowNumber;
            int colNumber;
            ResultSet rs = pStat.executeQuery();
            while (rs.next()) {
                seatNumber = rs.getInt("seatNumber");
                rowNumber = rs.getInt("rowNumber");
                colNumber = rs.getInt("columnNumber");
                Seat newSeat = new Seat(seatNumber, rowNumber, colNumber);
                seatList.add(newSeat);
            }
            pStat.close();
            return seatList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Theatre> loadTheatres() {

        try {
            String query = "SELECT * FROM THEATRES";
            PreparedStatement pStat = jdbc_connection.prepareStatement(query);
            ArrayList<Theatre> theaterList = new ArrayList<Theatre>();
            int theatreID;
            String theatreName;
            String address;
            ResultSet rs = pStat.executeQuery();
            while (rs.next()) {
                theatreID = rs.getInt("theatreID");
                theatreName = rs.getString("theatreName");
                address = rs.getString("address");
                Theatre newTheatre = new Theatre(theatreID, theatreName, address);
                theaterList.add(newTheatre);
            }
            pStat.close();
            return theaterList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public ArrayList<User> loadUsers() {

        try {
            String query = "SELECT * FROM USER";
            PreparedStatement pStat = jdbc_connection.prepareStatement(query);
            ArrayList<User> userList = new ArrayList<User>();
            String personalEmail;
            String password;
            String name;
            long creditCard;
            String address;
            int daysLeft;
            int memberId;
            ResultSet rs = pStat.executeQuery();
            while (rs.next()) {
            	memberId = rs.getInt("userID");
                personalEmail = rs.getString("personalEmail");
                password = rs.getString("password");
                name = rs.getString("name");
                creditCard = rs.getLong("creditCard");
                address = rs.getString("address");
                daysLeft = rs.getInt("remainingDays");
                RegisteredUser newUser = new RegisteredUser(daysLeft, personalEmail, name, password, creditCard,  address, memberId);
                userList.add(newUser);
            }
            pStat.close();
            return userList;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}