package views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenuView extends JFrame {
    private JLabel jcomp1;
    private JButton theatreButton;
    private JButton newsButton;
    private JButton refundButton;
    private JButton quitButton;
    private JPanel panel;

    public MainMenuView() {
    	panel = new JPanel();
    	setTitle("Movie Theatre App");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setContentPane(this.panel);
        pack();
        setSize (240, 340);
        panel.setLayout(null);
        panel.setBackground(new Color(217, 217, 217));
        
        addLabels();
        
        addOptions();
        
        setVisible (false);
        
    }
    
    //---------------------------------------------------------------------------------------
    // DISPLAY LABELS
    //---------------------------------------------------------------------------------------
    private void addLabels() {
    	jcomp1 = new JLabel ("Main Menu");
    	jcomp1.setFont(new Font("Andale Mono", Font.BOLD, 20));
    	
    	panel.add (jcomp1);
    	
    	jcomp1.setBounds (60, 35, 120, 30);
	}

    //---------------------------------------------------------------------------------------
    // DISPLAY MENU OPTIONS
    //---------------------------------------------------------------------------------------
	private void addOptions() {
        theatreButton = new JButton ("Find Movies");
        newsButton = new JButton ("Check News");
        refundButton = new JButton ("Refund Tickets");
        quitButton = new JButton ("Back");

        panel.add (theatreButton);
        panel.add (newsButton);
        panel.add (refundButton);
        panel.add (quitButton);

        theatreButton.setBounds (50, 85, 120, 25);
        newsButton.setBounds (55, 185, 110, 25);
        refundButton.setBounds (45, 135, 130, 25);
        quitButton.setBounds (60, 235, 100, 25);		
	}
	
	//add getting started//theatre button listener
	public void addTheatreListener(ActionListener theat) {
		theatreButton.addActionListener(theat);
	}
	
	//add check news button listener
	public void addNewsListener(ActionListener news) {
		newsButton.addActionListener(news);
	}
	
	//add refund button listener
	public void addRefundListener(ActionListener refund) {
		refundButton.addActionListener(refund);
	}
	
	//add quit button listener
	public void addQuitListener(ActionListener quit) {
		quitButton.addActionListener(quit);
	}
	
	//---------------------------------------------------------------------------------------
    // FOR POP-UPS
    //---------------------------------------------------------------------------------------
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
}