package viewcontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

import users.Ticket;
import users.Voucher;
import views.CancelTicketView;

public class CancelViewController {
	private GUIController gui;
	private CancelTicketView view;

	public CancelViewController(GUIController gui) {
		this.gui = gui;
		view = new CancelTicketView();
		addListeners();
	}

	public void populateTicketsInfo() {
		DefaultListModel<String> list = view.getListModel();
		list.clear();

		for (Ticket t : gui.getApp().getCurrentUser().getTicketsArray()) {

			String str = "Ticket ID;" + t.getTicketId() + ";";
			str += "Ticket MovieTitle;" + t.getMovieTitle() + ";";
			str += "Show Time;" + t.getShowTime();

			list.addElement(str);
		}
	}

	public void showGUI() {
		view.setVisible(true);
		populateTicketsInfo();
	}

	private void addListeners() {
		// cancel selected ticket
		view.addCancelListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!view.getTicketField().isSelectionEmpty()) {
					String ticket = view.getTicketField().getSelectedValue();
					// gui.receiveRequestFromGUI(, ticket);
					System.out.println(ticket);

					String results[] = ticket.split(";");

					if (gui.getApp().getCurrentUser() != null) {
						Ticket refundTicket = gui.getApp().getCurrentUser().refundTicket(Integer.parseInt(results[1]));
						if (refundTicket != null) {
							gui.getApp().processRefund(refundTicket);
							populateTicketsInfo();

						}

					}
				}
			}
		});

		// go to main menu
		view.addMenuListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gui.receiveRequestFromGUI(0, "");
			}

		});

	}
}
