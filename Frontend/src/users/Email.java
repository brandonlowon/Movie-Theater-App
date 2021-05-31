package users;
public class Email {
    private String emailAddress;
    private String subject;
    private String body;

    public Email(String address){
        emailAddress = address;
        subject = null;
        body = null;
    }

    public Email(String subject, String body, String address){
        this.subject = subject;
        this.body = body;
        emailAddress = address;
    }

    
    public void sendEmail(){
        subject = null;
        body = null;     
    }


    /**
     * @return String return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return String return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }


    /**
     * @return String return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
