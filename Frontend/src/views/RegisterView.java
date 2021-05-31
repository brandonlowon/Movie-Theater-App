package views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class RegisterView extends JFrame {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JLabel jcomp6;
    private JButton registerButton;
    private JButton goBackButton;
    private JTextField nameField;
    private JTextField addressField;
    private JTextField creditField;
    private JTextField emailField;
    private JPasswordField passField;
	private JPanel panel;

    public RegisterView() {
    	panel = new JPanel();
    	setTitle("Movie Theatre App");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setContentPane(this.panel);
        pack();
        setSize (400, 512);
        panel.setLayout(null);
        panel.setBackground(new Color(217, 217, 217));
        
        addLabels();
        addRegisterInfo();
        
        setVisible (false);
    }
    
 	//---------------------------------------------------------------------------------------
    // DISPLAY REGISTER INFORMATION
    //---------------------------------------------------------------------------------------
    private void addRegisterInfo() {
        registerButton = new JButton ("Register");
        goBackButton = new JButton ("Go Back");
        nameField = new JTextField (5);
        addressField = new JTextField (5);
        creditField = new JTextField (5);
        emailField = new JTextField (5);
        passField = new JPasswordField (5);

        panel.add (registerButton);
        panel.add (goBackButton);
        panel.add (nameField);
        panel.add (addressField);
        panel.add (creditField);
        panel.add (emailField);
        panel.add (passField);

        registerButton.setBounds (150, 360, 100, 25);
        goBackButton.setBounds (150, 410, 100, 25);
        nameField.setBounds (200, 130, 120, 25);
        addressField.setBounds (200, 165, 120, 25);
        creditField.setBounds (200, 210, 120, 25);
        emailField.setBounds (200, 250, 120, 25);
        passField.setBounds (200, 290, 120, 25);
	}
    
    // get name
    public JTextField getNameField() {
		return nameField;
	}
    
    //get address
    public JTextField getAddressField() {
		return addressField;
	} 
    
    //get credit card number
    public JTextField getCreditField() {
		return creditField;
	} 
    
    //get email
    public JTextField getEmailField() {
		return emailField;
	} 
    
    //get password
    public JPasswordField getPassField() {
		return passField;
	}
    
    //add register button listener
    public void addRegisterListener(ActionListener reg) {
    	registerButton.addActionListener(reg);
    }
     
    //add go back button listner 
    public void addBackListener(ActionListener back) {
    	goBackButton.addActionListener(back);
    }
    
    //---------------------------------------------------------------------------------------
    // DISPLAY LABELS
    //---------------------------------------------------------------------------------------
	private void addLabels() {
		jcomp1 = new JLabel ("Register New User");
		jcomp1.setFont(new Font("Andale Mono", Font.BOLD, 20));
        jcomp2 = new JLabel ("Name");
        jcomp3 = new JLabel ("Address");
        jcomp4 = new JLabel ("Credit Card Number");
        jcomp5 = new JLabel ("Password");
        jcomp6 = new JLabel ("Email");
        
        panel.add (jcomp1);
        panel.add (jcomp2);
        panel.add (jcomp3);
        panel.add (jcomp4);
        panel.add (jcomp5);
        panel.add (jcomp6);
        
        jcomp1.setBounds (100, 40, 200, 55);
        jcomp2.setBounds (80, 130, 120, 25);
        jcomp3.setBounds (80, 170, 120, 25);
        jcomp4.setBounds (80, 210, 120, 25);
        jcomp5.setBounds (80, 290, 120, 25);
        jcomp6.setBounds (80, 250, 120, 25);
	}
	
	//---------------------------------------------------------------------------------------
    // FOR POP-UPS
    //---------------------------------------------------------------------------------------
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
}
