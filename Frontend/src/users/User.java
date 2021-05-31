package users;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class User {
	protected Email personalEmail;
	protected ArrayList<PaymentController> payments;
	protected ArrayList<Voucher> vouchers;
	protected String password;

	public User(String email, String password, ArrayList<PaymentController> payments, ArrayList<Voucher> vouchers) {
		personalEmail = new Email(email);
		this.payments = payments;
		this.vouchers = vouchers;
		this.password = password;
	}

	public abstract Ticket refundTicket(int ticketId);

	public abstract boolean isRegistered();

	public Voucher checkVoucher(String voucherId) {
		for (Voucher find : vouchers) {
			try {
				if (find.getVoucherId() == Integer.parseInt(voucherId)) {
					return find;
				}
			} catch (Exception e) {
				return null;
			}
		}
		return null;
	}

	public double checkVoucherPrice(String voucherId) {
		for (Voucher find : vouchers) {
			try {
				if (find.getVoucherId() == Integer.parseInt(voucherId)) {
					return find.getDollarValue();
				}
			} catch (Exception e) {
				return 0;
			}
		}
		return 0;
	}

	public abstract boolean purchaseTicket(ArrayList<String> voucherIds, ArrayList<Ticket> tickets, long creditCard);

	public String getTickets() {
		String rtn = "";
		for (PaymentController controller : payments) {

			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();

			String date = dateFormat.format(now);
			String[] dateHalf = date.split(" ");
			String dateTicket = controller.getTicket().getShowTime();
			String[] dateHalfTicket = dateTicket.split(" ");
			if (dateHalf[0].compareTo(dateHalfTicket[0]) >= 0) {
				payments.remove(controller);
			} else {
				rtn += controller.getTicket().toString() + "\n\n";
			}
		}
		return rtn;
	}

	public ArrayList<Ticket> getTicketsArray() {
        ArrayList<Ticket> rtn = new ArrayList<Ticket>();
        ArrayList<PaymentController> remove = new ArrayList<PaymentController>();
        for (PaymentController controller : payments) {

            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
            LocalDateTime now = LocalDateTime.now();

            String dateTicket = controller.getTicket().getPurchaseDate();
            LocalDateTime ticketDate = LocalDateTime.parse(dateTicket, dateFormat);

            if (now.isAfter(ticketDate.minusHours(72))) {
                remove.add(controller);
            } else {
                rtn.add(controller.getTicket());
            }

        }
        payments.removeAll(remove);
        return rtn;
    }
	
	
	
	
	
//	public ArrayList<Ticket> getTicketsArray() {
//		ArrayList<Ticket> rtn = new ArrayList<Ticket>();
//		ArrayList<PaymentController> remove = new ArrayList<PaymentController>();
//		for (PaymentController controller : payments) {
//
//			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//			LocalDateTime now = LocalDateTime.now();
//
//			String date = dateFormat.format(now);
//			String[] dateHalf = date.split(" ");
//			String dateTicket = controller.getTicket().getPurchaseDate();
//			String[] dateHalfTicket = dateTicket.split(" ");
//			System.out.println(dateHalf[0] + " " + dateHalfTicket[0]);
//			if (dateHalf[0].compareTo(dateHalfTicket[0]) >= 0) {
//				remove.add(controller);
//			} else {
//				rtn.add(controller.getTicket());
//			}
//
//		}
//		payments.removeAll(remove);
//		return rtn;
//	}

	public String getVouchers() {
		String rtn = "";
		for (Voucher vouch : vouchers) {
			rtn += vouch.toString() + "\n";
		}
		return rtn;
	}

	/**
	 * @return Email return the personalEmail
	 */
	public Email getPersonalEmail() {
		return personalEmail;
	}

	/**
	 * @param personalEmail the personalEmail to set
	 */
	public void setPersonalEmail(Email personalEmail) {
		this.personalEmail = personalEmail;
	}

	/**
	 * @return ArrayList<PaymentController> return the payments
	 */
	public ArrayList<PaymentController> getPayments() {
		return payments;
	}

	/**
	 * @param payments the payments to set
	 */
	public void setPayments(ArrayList<PaymentController> payments) {
		this.payments = payments;
	}

	/**
	 * @return ArrayList<Voucher> return the vouchers
	 */
	public ArrayList<Voucher> getVoucherList() {
		return vouchers;
	}

	/**
	 * @param vouchers the vouchers to set
	 */
	public void setVoucherList(ArrayList<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	/**
	 * @return String return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
