package viewcontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import views.RegisterView;

public class RegisterViewController {
	private GUIController gui;
	private RegisterView view;
	
	public RegisterViewController(GUIController gui) {
		this.gui = gui;
		view = new RegisterView();
	}
	
	public void showGUI() {
		addListeners();
		view.setVisible(true);
	}

	private void addListeners() {
		view.addRegisterListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = view.getNameField().getText();
				String cred = view.getCreditField().getText();
				String adr = view.getAddressField().getText();
				String email = view.getEmailField().getText(); 
				String pass = String.valueOf(view.getPassField().getPassword());
				
				if(isLong(cred)){
					Long credNum = Long.parseLong(cred);
					view.setVisible(false);
					gui.receiveRequestFromGUI(-1, name + ";" + credNum + ";" + adr + ";" + email + ";" + pass);
				}
				else {
					view.showError("Invalid credit card number!");
				}
				
			}
			
		});
		
		view.addBackListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gui.receiveRequestFromGUI(-2, "");
			}
			
		});
		
	}
	
	private boolean isLong(String s) {
		boolean isValidInteger = false;
		
	    try {
	    	Long.parseLong(s);
	         isValidInteger = true;
	    } catch (NumberFormatException ex) {
	         // s is not an integer
	    }
	 
	    return isValidInteger;
	}
	
	public void showError(String errMessage) {
        JOptionPane.showMessageDialog(view, errMessage);
    }
}
