package viewcontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.LoginView;

public class LoginViewController {
	private GUIController gui;
	private LoginView view;

	public LoginViewController(GUIController guiController) {
		this.gui = guiController;
		view = new LoginView();
		addListeners();
	}

	public LoginView getView() {
		return view;
	}

	public void showGUI() {
		view.setVisible(true);

	}

	public void showError(String errMessage) {
		JOptionPane.showMessageDialog(view, errMessage);
	}

	private void addListeners() {
		view.addLoginButton(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String email = view.getEmailField().getText();
				String pass = String.valueOf(view.getPasswordField().getPassword());
				String result = email + ";" + pass;
				gui.receiveRequestFromGUI(1, result);
			}

		});

		view.addGuestLoginButton(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// send to GUI
				view.setVisible(false);
				gui.getApp().setCurrentUser(gui.getApp().getGuestUser());
				gui.receiveRequestFromGUI(0, "");
			}

		});

		view.addRegisterButton(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gui.receiveRequestFromGUI(11, "");
			}

		});
	}
}
