package views;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PaymentView extends JFrame {
	private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel amountLabel;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JLabel jcomp6;
    private JLabel jcomp7;
    private JLabel jcomp8;
    private JTextField voucherField;
    private JButton applyButton;
    private JTextField creditField;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField emailField;
    private JButton payButton;
    private JButton cancelButton;
    private JPanel panel;

    public PaymentView() {
    	panel = new JPanel();
    	setTitle("Movie Theater App");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setContentPane(this.panel);
        pack();
        setSize(470, 600);
        panel.setLayout(null);
        panel.setBackground(new Color(217, 217, 217));
        
        addLabels();
        addPaymentInfo();
        
        setVisible (false);
    }


    private void addPaymentInfo() {
    	voucherField = new JTextField (5);
        applyButton = new JButton ("Apply");
        creditField = new JTextField (5);
        nameField = new JTextField (5);
        addressField = new JTextField (5);
        emailField = new JTextField (5);
        payButton = new JButton ("Authorize Pay");
        cancelButton = new JButton ("Canel Pay");
		
    	panel.add (voucherField);
    	panel.add (applyButton);
    	panel.add (creditField);
    	panel.add (nameField);
    	panel.add (addressField);
    	panel.add (emailField);
    	panel.add (payButton);
    	panel.add (cancelButton);
        
    	voucherField.setBounds (190, 185, 120, 25);
        applyButton.setBounds (330, 185, 70, 25);
        creditField.setBounds (190, 225, 120, 25);
        nameField.setBounds (190, 265, 120, 25);
        addressField.setBounds (190, 305, 120, 25);
        emailField.setBounds (190, 345, 120, 25);
        payButton.setBounds (190, 415, 120, 25);
        cancelButton.setBounds (190, 465, 120, 25);
	}
    
    public JTextField getVoucherField() {
    	return voucherField;
    }
    
    public JTextField getCreditField() {
    	return creditField;
    }
    
    public JTextField getNameField() {
    	return nameField;
    }
    
    public JTextField getAddressField() {
    	return addressField;
    }
    
    public JTextField getEmailField() {
    	return emailField;
    }
    
    public void addApplyListener(ActionListener apply) {
    	applyButton.addActionListener(apply);
    }
    
    public void addPayListener(ActionListener pay) {
    	payButton.addActionListener(pay);
    }
    
    public void addCancelListener(ActionListener cancel) {
    	cancelButton.addActionListener(cancel);
    }
    
    //---------------------------------------------------------------------------------------
    // DISPLAY LABELS
    //---------------------------------------------------------------------------------------
	private void addLabels() {
		jcomp1 = new JLabel ("Payment");
		jcomp1.setFont(new Font("Andale Mono", Font.BOLD, 20));
        jcomp2 = new JLabel ("Total Amount:");
        amountLabel = new JLabel ("$0.00", SwingConstants.RIGHT);
        jcomp4 = new JLabel ("Voucher Code");
        jcomp5 = new JLabel ("Credit Card Number");
        jcomp6 = new JLabel ("Name");
        jcomp7 = new JLabel ("Address");
        jcomp8 = new JLabel ("Email");
        
        panel.add(jcomp1);
        panel.add(jcomp2);
        panel.add(amountLabel);
        panel.add(jcomp4);
        panel.add(jcomp5);
        panel.add(jcomp6);
        panel.add(jcomp7);
        panel.add(jcomp8);
        
        jcomp1.setBounds (175, 50, 100, 25);
        jcomp2.setBounds (55, 120, 100, 25);
        amountLabel.setBounds (180, 120, 120, 25);
        jcomp4.setBounds (50, 185, 130, 25);
        jcomp5.setBounds (50, 225, 130, 25);
        jcomp6.setBounds (50, 265, 130, 25);
        jcomp7.setBounds (50, 305, 130, 25);
        jcomp8.setBounds (50, 345, 130, 25);
	}
	
    // GET AMOUNT LABEL
	public JLabel getAmountLabel() {
    	return amountLabel;
    }
    
	//---------------------------------------------------------------------------------------
    // FOR POP-UPS
    //---------------------------------------------------------------------------------------
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
}
