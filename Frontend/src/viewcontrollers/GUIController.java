package viewcontrollers;

import java.util.ArrayList;

import model.App;

public class GUIController {

	public App getApp() {
		return app;
	}
	
	private App app;
	private TheatreViewController tvc;
	private SeatViewController svc;
	private PaymentViewController pvc;
	private LoginViewController lvc;
	private MainMenuController mmc;
	private NewsViewController nmc;
	private RegisterViewController rvc;
	private GuestMovieViewController gvc;
	private RegisteredMovieViewController rmc;
	private CancelViewController cvc;
	public boolean isRegistered = false;

	public GUIController() {
		pvc = new PaymentViewController(this);
		tvc = new TheatreViewController(this);
		svc = new SeatViewController(this);
		lvc = new LoginViewController(this);
		mmc = new MainMenuController(this);
		nmc = new NewsViewController(this);
		rvc = new RegisterViewController(this);
		gvc = new GuestMovieViewController(this);
		rmc = new RegisteredMovieViewController(this);
		cvc = new CancelViewController(this);
	}

	////////////////
	// MVC NO MORE
	///////////////
	public void handlePayment(String body, ArrayList<String> voucherArray) {
		// get the seat ids user selected
		ArrayList<Integer> seatIDs = svc.scanButtons();
		String movieTime = "";
		if (isRegistered) {
			// get the movie selected
			String movie = (String) rmc.getView().getMovieChoice().getSelectedItem();
			// get the showtime selected
			String time = (String) rmc.getView().getTimeChoice().getSelectedItem();
			movieTime = movie + "&" + time;
		} else {
			// get the movie selected
			String movie = (String) gvc.getView().getMovieChoice().getSelectedItem();
			// get the showtime selected
			String time = (String) gvc.getView().getTimeChoice().getSelectedItem();
			movieTime = movie + "&" + time;
		}

		// send to app to process seats
		app.processSeats(movieTime, seatIDs, voucherArray, body);
	}

	public void receiveRequestFromGUI(int command, String body) {
		switch (command) {

		// MAIN MENU -> LOGIN
		// WHEN THE USER LOGS OUT OF THE MAIN MENU WE SET THE REGISTERED USER BACK TO
		// FALSE
		////////////////////////////
		// TO DO: RESET USER
		//////////////////////////////
		case -2:
			isRegistered = false;
			lvc.showGUI();
			break;

		// REGISTER -> LOGIN
		// WHEN THE USER REGISTERS AND WE GO BACK TO THE LOGIN VIEW
		case -1:
			getApp().addUser(body);
			lvc.showGUI();
			break;

		// ANYWHERE -> MAIN MENU
		// SHOWS THE MAIN MENU
		case 0:
			mmc.showGUI();
			break;

		// LOGIN -> MAIN MENU
		// WHEN THE USER LOGS IN AS A REGISTERED USER WE SHOW MAIN MENU
		case 1:
			// System.out.println(body);
			if (getApp().searchUserLogin(body)) {
				isRegistered = true;
				lvc.getView().setVisible(false);
				mmc.showGUI();
			} else {
				lvc.showError("You have entered the wrong email or password! Try Again!");
			}
			break;

		// MAIN MENU -> THEATRES
		// SHOW THEATERS FROM MAIN MENU
		case 2:
			tvc.showGUI();
			break;

		// THEATRES -> MOVIES
		// SHOW MOVIES FROM THEATER
		case 3:
			if (isRegistered)
				rmc.showGUI();
			else
				gvc.showGUI();
			// SAVE THE THEATER INFORMATION
			app.findTheatre(body);
			break;

		// MOVIES -> SEATS
		// SHOW SEATS FROM MOVIES
		case 4:
			svc.setSeatColour(app.retrieveSeatList(body));
			svc.showGUI();
			break;

		// SEATS -> PURCHASE
		// SHOW PURCHASE FROM SEATS
		case 5:
			pvc.showGUI();
			break;

		// MAIN MENU -> CANCEL TICKETS
		// SHOW CANCEL TICKETS AND GET REFUND
		case 6:
			cvc.showGUI();
			break;

		// SEATS -> MOVIE
		// BACK BUTTON FROM SEATS
		case 7:
			if (isRegistered)
				rmc.showGUI();
			else
				gvc.showGUI();
			break;

		// MAIN MENU -> CHECK NEWS
		// SHOW NEWS FROM MAIN MENU FOR REGISTERED USER
		case 9:
			if (isRegistered) {
				mmc.getView().setVisible(false);
				nmc.showGUI();
			} else {
				mmc.showError("Only Registered Users can access this!");
				mmc.getView().setVisible(true);
			}
			break;

		// PAYMENT -> MAIN MENU
		// PROCESS PAYMENT FROM GUI BY CALLING THE NECESSARY BUTTONS
		case 10:
			svc.scanButtons();
			break;

		// LOGIN -> REGISTER
		// SHOW REGISTERED VIEW
		case 11:
			rvc.showGUI();
			break;

		// PAYMENT -> SEATS
		// PAYMENT CANCEL, GO BACK TO SEAT SELECTION
		case 12:
			svc.showGUI();
			break;

		default:
			System.out.println("Nothing selected");
		}
	}

	public RegisteredMovieViewController getRmc() {
		return rmc;
	}

	public TheatreViewController getTvc() {
		return tvc;
	}

	public SeatViewController getSvc() {
		return svc;
	}

	public void setSvc(SeatViewController svc) {
		this.svc = svc;
	}

	public void setApp(App app) {
		this.app = app;
	}

	public void setTvc(TheatreViewController tvc) {
		this.tvc = tvc;
	}

}
