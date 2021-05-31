package users;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.awt.Frame;
import javax.swing.*;

public class RegisteredUser extends User {

	private int memberId;
	private int subscriptionDaysLeft;
	private String name;
	private ArrayList<Long> creditCards;
	private String address;
	private LocalDateTime subscriptionDateValue;

	public RegisteredUser(int daysLeft, String email, String name, String password, long card, String address) {
		super(email, password, new ArrayList<PaymentController>(), new ArrayList<Voucher>());
		creditCards = new ArrayList<Long>();
		creditCards.add(card);
		this.name = name;
		this.address = address;
		memberId = (int) Math.random() * 100000;
		subscriptionDaysLeft = daysLeft;
		LocalDateTime now = LocalDateTime.now();
		subscriptionDateValue = now.plusDays(daysLeft);
	}

	public RegisteredUser(int daysLeft, String email, String name, String password, long card, String address,
			int memberId) {
		super(email, password, new ArrayList<PaymentController>(), new ArrayList<Voucher>());
		creditCards = new ArrayList<Long>();
		creditCards.add(card);
		this.name = name;
		this.address = address;
		this.memberId = memberId;
		subscriptionDaysLeft = daysLeft;
		LocalDateTime now = LocalDateTime.now();
		subscriptionDateValue = now.plusDays(daysLeft);
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

					if (dateHalf[0].compareTo(dateHalfTicket[0]) < 0) {
						Voucher newVoucher = new Voucher(dateFormat.format(now.plusDays(365)),
								tempController.getTicket().getPrice());

						vouchers.add(newVoucher);
						payments.remove(tempController);
						Frame[] frames = Frame.getFrames();
						JOptionPane.showMessageDialog(frames[0], newVoucher.toString());

						return tempController.getTicket();
					} else if (dateHalf[0].compareTo(dateHalfTicket[0]) > 0) {
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
		return true;
	}

	/**
	 * @return int return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return int return the subscriptionDaysLeft
	 */
	public int getSubscriptionDaysLeft() {
		return subscriptionDaysLeft;
	}

	/**
	 * @param subscriptionDaysLeft the subscriptionDaysLeft to set
	 */
	public void setSubscriptionDaysLeft(int subscriptionDaysLeft) {
		this.subscriptionDaysLeft = subscriptionDaysLeft;
	}

	/**
	 * @return String return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return long return the creditCard
	 */
	public ArrayList<Long> getCreditCards() {
		return creditCards;
	}

	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(ArrayList<Long> creditCard) {
		this.creditCards = creditCard;
	}

	/**
	 * @return String return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public boolean paySubscriptionFee() {
		LocalDateTime now = LocalDateTime.now();
		if (now.isAfter(subscriptionDateValue)) {
			for (long card : creditCards) {
				if (Long.toString(card).length() != 16) {
					Frame[] frames = Frame.getFrames();
					JOptionPane.showMessageDialog(frames[0], "Subscription fee was not paid!\nCredit Card invalid!");
					return false;
				}
				int sum = 0;
				boolean alternate = false;
				for (int i = 15; i > 0; i--) // check the Luhn algorithm to ensure a valid card
				{
					long temp = card / (i * 10);

					if (alternate == true) {
						temp = temp * 2;
					}

					sum += temp / 10;
					sum += temp % 10;

					alternate = !alternate;
				}
				if (sum % 10 != 0) {
					Frame[] frames = Frame.getFrames();
					JOptionPane.showMessageDialog(frames[0], "Subscription fee was not paid!\nCredit Card invalid!");
					return false;
				}
			}
			subscriptionDateValue = now.plusYears(1);
			Frame[] frames = Frame.getFrames();
			JOptionPane.showMessageDialog(frames[0], "Subscription Fee was paid, your credit card was charged $100");

		}
		return true;
	}

	public boolean paySubscriptionFee(long creditCardNew) {
		LocalDateTime now = LocalDateTime.now();
		if (now.isAfter(subscriptionDateValue)) {
			if (Long.toString(creditCardNew).length() != 16) {
				return paySubscriptionFee();
			}
			int sum = 0;
			boolean alternate = false;
			for (int i = 15; i > 0; i--) // check the Luhn algorithm to ensure a valid card
			{
				long temp = creditCardNew / (i * 10);

				if (alternate == true) {
					temp = temp * 2;
				}

				sum += temp / 10;
				sum += temp % 10;

				alternate = !alternate;
			}
			if (sum % 10 != 0) {
				return paySubscriptionFee();
			}
			this.creditCards.add(creditCardNew);
			subscriptionDateValue = now.plusYears(1);
			Frame[] frames = Frame.getFrames();
			JOptionPane.showMessageDialog(frames[0], "Subscription Fee was paid, your credit card was charged $100");

		}
		return true;
	}

	@Override
	// set the voucherIds to null if there is none
	public boolean purchaseTicket(ArrayList<String> voucherIds, ArrayList<Ticket> tickets, long creditCard) {

		ArrayList<Ticket> remove = new ArrayList<Ticket>();
		// SUBSCIPTION PAYMENT
		if (!paySubscriptionFee(creditCard)) {
			return false;
		}

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
