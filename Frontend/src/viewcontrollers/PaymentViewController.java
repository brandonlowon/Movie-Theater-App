package viewcontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import users.GuestUser;
import users.RegisteredUser;
import views.PaymentView;

public class PaymentViewController {
	private GUIController gui;
	private PaymentView view;
	private ArrayList<String> vouchers;

	public PaymentViewController(GUIController gui) {
		this.gui = gui;
		view = new PaymentView();
		addListeners();
		vouchers = new ArrayList<String>();
	}

	public void showGUI() {

		view.setVisible(true);

		String amount = String.valueOf((gui.getApp().getNumberBought() * 10));
		view.getAmountLabel().setText(amount + ".00");
		if (gui.isRegistered) {
			if (gui.getApp().getCurrentUser() instanceof RegisteredUser) {
				RegisteredUser user = (RegisteredUser) gui.getApp().getCurrentUser();
				String cred = String.valueOf(user.getCreditCards().get(0));
				view.getCreditField().setText(cred);

				String name = user.getName();
				view.getNameField().setText(name);

				String adr = user.getAddress();
				view.getAddressField().setText(adr);

				String email = user.getPersonalEmail().getEmailAddress();
				view.getEmailField().setText(email);
			}
		}else {
			view.getCreditField().setText("");
			view.getNameField().setText("");
			view.getAddressField().setText("");
			view.getEmailField().setText("");
		}
	}

	private void addListeners() {
		view.addApplyListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String vouch = view.getVoucherField().getText();
				boolean usedUp = false;
				for (String i : vouchers) {
					if (i.equals(vouch)) {
						usedUp = true;
						showError("This voucher has been applied already!");
					}
				}

				if (!usedUp) {
					double discount = gui.getApp().getCurrentUser().checkVoucherPrice(vouch);
					System.out.println(discount);
					if (discount != 0) {
						double amount = Double.parseDouble(view.getAmountLabel().getText());
						double newAmount = amount - discount;
						view.getAmountLabel().setText(String.valueOf(newAmount));

						vouchers.add(vouch);
						view.getVoucherField().setText("");
					} else {
						showError("Invalid voucher code!");
					}

				}
			}
		});

		view.addPayListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cred = view.getCreditField().getText();
				if (isLong(cred)) {
					String name = view.getNameField().getText();
					String adr = view.getAddressField().getText();
					String email = view.getEmailField().getText();
					String info = email + ";" + name + ";" + cred + ";" + adr;

					if (gui.getApp().getCurrentUser() == null)
						gui.getApp().setCurrentUser(new GuestUser(email));

					gui.handlePayment(info, vouchers);
					showError("Tickets Paid!");
					vouchers.clear();

					view.setVisible(false);
					gui.receiveRequestFromGUI(0, "");
				} else {
					showError("Invalid credit card number!");
				}
			}

		});

		view.addCancelListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gui.receiveRequestFromGUI(12, "");
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

	// ---------------------------------------------------------------------------------------
	// FOR POP-UPS
	// ---------------------------------------------------------------------------------------
	public void showError(String errMessage) {
		JOptionPane.showMessageDialog(view, errMessage);
	}
}
