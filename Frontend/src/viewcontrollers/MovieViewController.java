package viewcontrollers;

import views.MovieView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieViewController {

	private MovieView view;
	private GUIController guiController;

	MovieViewController(GUIController controller) {
		view = new MovieView();
		view.addMainMenuButton(new MainMenuButton());
		view.addSelectButton(new SelectMovieButton());
		guiController = controller;

	}

	public void createGui() {
		view = new MovieView();
	}

	public void setGuiController(GUIController guiController) {
		this.guiController = guiController;
	}

	public void showGUI() {
		view.setVisible(true);
	}

	public MovieView getView() {
		return view;
	}

	public class MainMenuButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int command = 2;
			view.setVisible(false);
			guiController.receiveRequestFromGUI(command, " ");
		}
	}

	public class SelectMovieButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String movie = (String) view.getMovieChoice().getSelectedItem();
			String time = (String) view.getTimeChoice().getSelectedItem();
//			if (movie.equals("Finding Nemo") || movie.equals("The Imitation Game")) {
//				if (guiController.isRegistered) {
//					System.out.println("Selected " + movie + " at " + time);
//					view.setVisible(false);
//					int command = 4;
//					guiController.receiveRequestFromGUI(command, movie + "&" + time);
//				} else {
//					view.showError("Sorry only registered users can book this movie!");
//				}
//
//			} else {
				System.out.println("Selected " + movie + " at " + time);
				view.setVisible(false);
				int command = 4;
				guiController.receiveRequestFromGUI(command, movie + "&" + time);
			}

		//}
	//}

}
}