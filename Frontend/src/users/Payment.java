package users;
public class Payment {
    
    private String date;
    private double amount;

    public Payment(String date, double amount){
        this.date = date;
        this.amount = amount;
    }


    public void printReceipt(){
        //not sure what goes here either...
    }

    public void handleRefund(){
        //not sure what goes here either...
    }

    /**
     * @return String return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return double return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

}
