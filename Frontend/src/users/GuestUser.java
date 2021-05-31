package users;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.awt.Frame;
import javax.swing.*;

public class GuestUser extends User {

	private int guestId;

	public GuestUser(String email) {
		super(email, null, new ArrayList<PaymentController>(), new ArrayList<Voucher>());
		guestId = (int) (Math.random() * 100000);
	}

	public GuestUser(String email, String password) {
		super(email, password, new ArrayList<PaymentController>(), new ArrayList<Voucher>());
		guestId = (int) Math.random() * 100000;
	}

	/**
	 * @return int return the guestId
	 */
	public int getGuestId() {
		return guestId;
	}

	/**
	 * @param guestId the guestId to set
	 */
	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	@Override
	public Ticket refundTicket(int ticketId) {
		for (PaymentController tempController : payments) {
			if (tempController.getTicket().getTicketId() == ticketId) {
				DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				try {
					String date = dateFormat.format(now);
					String[] dateHalf = date.split(" ");
					String dateTicket = tempController.getTicket().getShowTime();
					String[] dateHalfTicket = dateTicket.split(" ");

					if (dateHalf[0].compareTo(dateHalfTicket[0]) < 2) { // ticket is refundable
						Voucher newVoucher = new Voucher(dateFormat.format(now),
								tempController.getTicket().getPrice() * .85);
						vouchers.add(newVoucher);
						payments.remove(tempController);
						Frame[] frames = Frame.getFrames();
						JOptionPane.showMessageDialog(frames[0], newVoucher.toString());
						return tempController.getTicket();
					} else if (dateHalf[0].compareTo(dateHalfTicket[0]) > 0) { // remove old tickets
						payments.remove(tempController);
					}

				} catch (Exception e) {
					return null;
				}

			}
		}
		return null;
	}

	@Override
	public boolean isRegistered() {
		return false;
	}

	@Override
	// set the voucherIds to null if there is none
	public boolean purchaseTicket(ArrayList<String> voucherIds, ArrayList<Ticket> tickets, long creditCard) {
		ArrayList<Ticket> remove = new ArrayList<Ticket>();

		PaymentController payment = new PaymentController();
		double ticketPrice = 0;
		ArrayList<Voucher> usedVouchers = new ArrayList<Voucher>();

		if (voucherIds != null && voucherIds.size() != 0) { // check voucher ids
			for (Ticket t : tickets) {
				ticketPrice += t.getPrice(); // allows overlap of vouchers
				for (String temp : voucherIds) {
					Voucher foundVoucher = checkVoucher(temp); // find the voucher (if good)
					if (foundVoucher != null) {
						t.setPrice(ticketPrice);
						ticketPrice = payment.payWithVoucher(t, foundVoucher.getDollarValue()); // reduce voucher
																								// payment
						if (ticketPrice <= 0) { // ticket can be purchased with the voucher
							usedVouchers.add(foundVoucher);
							for (Voucher used : usedVouchers) { // remove all vouchers used to pay
								this.vouchers.remove(used);
							}
							DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
							LocalDateTime now = LocalDateTime.now();
							this.payments
									.add(new PaymentController(new Payment(dateFormat.format(now), t.getPrice()), t));
							remove.add(t);
							break; // get a new ticket
						} else {
							usedVouchers.add(foundVoucher);
						}
					}
				}
				for (Voucher used : usedVouchers) { // remove all vouchers used to pay
					voucherIds.remove(Integer.toString(used.getVoucherId()));

				}
			}
		}
		tickets.removeAll(remove);
		if (tickets.size() > 0) {
			for (Ticket t : tickets) {
				if (ticketPrice != 0) { // check if any more vouchers can be partially used
					double tempPrice = t.getPrice();
					if (ticketPrice > 0) {
						t.setPrice(ticketPrice);
					} else {
						t.setPrice(tempPrice + ticketPrice);
					}
					if (payment.pay(t, creditCard)) { // try and pay remainder with card, if success then remove
														// vouchers
						this.payments.add(payment);
						payment = new PaymentController();
						ticketPrice = 0;
						remove.add(t);
						for (Voucher used : usedVouchers) { // remove all vouchers used to pay
							this.vouchers.remove(used);
						}
					} else {
						t.setPrice(tempPrice);
						return false;
					}
				} else if (payment.pay(t, creditCard)) { // pay with card
					this.payments.add(payment);
					payment = new PaymentController();
					remove.add(t);
				} else {
					return false;
				}
			}

		} else { // paid using entirely vouchers
			Voucher lastVoucher = usedVouchers.get(usedVouchers.size() - 1);
			for (Voucher used : usedVouchers) { // remove all vouchers used to pay
				this.vouchers.remove(used);
			}
			vouchers.add(new Voucher(lastVoucher.getExpirationDate(), lastVoucher.getDollarValue() + ticketPrice)); // ticketprice
			// 0
		}
		tickets.removeAll(remove);
		if (tickets.size() > 0) { // tickets not paid for
			System.out.println(tickets.size());
			return false;
		}

		return true;
	}
}
