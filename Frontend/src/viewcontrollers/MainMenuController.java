package viewcontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.MainMenuView;

public class MainMenuController {
	private GUIController gui;
	private MainMenuView view;
	
	public MainMenuController(GUIController gui) {
		this.gui = gui; 
		view = new MainMenuView();
		addListeners();
		
	}
	
	public MainMenuView getView() {
		return view;
	}

	public void showGUI() {
		view.setVisible(true);
		
	}
	
	public void showError(String errMessage) {
        JOptionPane.showMessageDialog(view, errMessage);
    }


	private void addListeners() {
		// get starting/ select theatre
		view.addTheatreListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//send to GUI
				view.setVisible(false);
				gui.receiveRequestFromGUI(2, "");
			}
			
		});
		
		// check news
		view.addNewsListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gui.receiveRequestFromGUI(9, "");
			}
			
		});
		
		// refunds
		view.addRefundListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gui.receiveRequestFromGUI(6, "");
			}
			
		});
		
		// login, go back
		view.addQuitListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gui.receiveRequestFromGUI(-2, "");
			}
			
		});
		
	}	
}
