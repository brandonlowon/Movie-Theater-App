package viewcontrollers;

import views.TheatreView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Theatre;

public class TheatreViewController {

	private TheatreView view;

	private GUIController guiController;

	public TheatreViewController(GUIController guiController) {
		view = new TheatreView();
		view.addSelectButton(new SelectButton());
		view.addExitButton(new ExitButton());
		view.addInfoButton(new InfoButton());
		this.guiController = guiController;
	}

	public void setGuiController(GUIController guiController) {
		this.guiController = guiController;
	}

	public class SelectButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String theatre = (String) view.getTheatreChoice().getSelectedItem();
			view.setVisible(false);
			int command = 3;
			guiController.receiveRequestFromGUI(command, theatre);

		}
	}

	public void showGUI() {
		view.setVisible(true);
		String str = guiController.getApp().getListOfTheatres()
				.searchTheatre((String) view.getTheatreChoice().getSelectedItem()).toString();
		view.getTheatreInformation().setText(str);
	}

	public class ExitButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Exit button hit");
			view.setVisible(false);
			guiController.receiveRequestFromGUI(0, "");

		}
	}

	public class InfoButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = guiController.getApp().getListOfTheatres()
					.searchTheatre((String) view.getTheatreChoice().getSelectedItem()).toString();
			view.getTheatreInformation().setText(str);
		}
	}

	public TheatreView getView() {
		return view;
	}

	public void setView(TheatreView view) {
		this.view = view;
	}

}
