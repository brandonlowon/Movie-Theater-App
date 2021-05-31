package users;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaymentController {
	private Payment purchase;
	private Ticket ticket;

	public PaymentController(Payment purchase, Ticket ticket) {
		this.purchase = purchase;
		this.ticket = ticket;
	}

	public PaymentController() {
		purchase = null;
		ticket = null;
	}

	public boolean pay(Ticket ticket, long creditCard) {
		if (Long.toString(creditCard).length() != 16) {
			System.out.println("PAYMENT FIRST FALSE");
			return false;
		}
		int sum = 0;
		boolean alternate = false;
		for (int i = 15; i > 0; i--) // check the Luhn algorithm to ensure a valid card
		{
			long temp = creditCard / (i * 10);

			if (alternate == true) {
				temp = temp * 2;
			}

			sum += temp / 10;
			sum += temp % 10;

			alternate = !alternate;
		}
		if (sum % 10 != 0) {
			System.out.println("PAYMENT SECOND FALSE");
			return false;
		} else {
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			purchase = new Payment(dateFormat.format(now), ticket.getPrice());
			this.ticket = ticket;
			return true;
		}
	}

	// checks credit card, if true, sets the payment and ticket to this class
	public double payWithVoucher(Ticket ticket, double voucher_amount) {

		if (voucher_amount >= ticket.getPrice()) {
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			purchase = new Payment(dateFormat.format(now), ticket.getPrice());
			this.ticket = ticket;
		}
		return  ticket.getPrice() - voucher_amount;

	}

	/**
	 * @return Payment return the purchase
	 */
	public Payment getPurchase() {
		return purchase;
	}

	/**
	 * @param purchase the purchase to set
	 */
	public void setPurchase(Payment purchase) {
		this.purchase = purchase;
	}

	/**
	 * @return Ticket return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}
