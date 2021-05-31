package viewcontrollers;

import views.RegisteredMovieView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisteredMovieViewController {

	private RegisteredMovieView view;
	private GUIController guiController;

	RegisteredMovieViewController(GUIController controller) {
		view = new RegisteredMovieView();
		view.addMainMenuButton(new MainMenuButton());
		view.addSelectButton(new SelectMovieButton());
		guiController = controller;

	}

	public void showGUI() {
		view.setVisible(true);
	}

	public RegisteredMovieView getView() {
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
			view.setVisible(false);
			int command = 4;
			guiController.receiveRequestFromGUI(command, movie + "&" + time);
		}

		// }
		// }

	}
}