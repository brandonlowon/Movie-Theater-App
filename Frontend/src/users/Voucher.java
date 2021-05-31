package users;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voucher {
    private String expirationDate;
    private int voucherId;
    private double dollarValue;

    public Voucher(String date, double value){
        expirationDate = date;
        dollarValue = value;
        voucherId=(int)(Math.random()*100000);
    }

    public Voucher(String date, int i, double value) {
    	 expirationDate = date;
         dollarValue = value;
         voucherId = i;
	}

	@Override
    public String toString(){
        //checkExpiry();
        String s = "";
        s += "Voucher Id: " + Integer.toString(voucherId)+ "\n";
        s += "Dollar Value: "+Double.toString(dollarValue) + "\n";
        s += "Expiration Date: "+ expirationDate + "\n";
        return s;
    }

    /**
     * @return String return the expirationDate
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * @return int return the voucherId
     */
    public int getVoucherId() {
        //checkExpiry();
        return voucherId;
    }

    /**
     * @param voucherId the voucherId to set
     */
    public void setVoucherId(int voucherId) {
        this.voucherId = voucherId;
    }

    /**
     * @return double return the dollarValue
     */
    public double getDollarValue() {
        return dollarValue;
    }

    /**
     * @param dollarValue the dollarValue to set
     */
    public void setDollarValue(double dollarValue) {
        this.dollarValue = dollarValue;
    }

    private void checkExpiry(){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        if(expirationDate.compareToIgnoreCase(dateFormat.format(now)) < 0){
            setDollarValue(0);
        }  
    }

}
