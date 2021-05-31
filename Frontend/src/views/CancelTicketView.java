package views;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

public class CancelTicketView extends JFrame {
	private DefaultListModel<String> listModel;
    private JList<String> ticketsField;
    private JScrollPane scrollPane;
    private JLabel jcomp2;
    private JButton cancelButton;
    private JButton mainMenuButton;
    private JPanel panel;

    public CancelTicketView() {
         panel = new JPanel();
    	 setTitle("Movie Theater App");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setContentPane(this.panel);
         pack();
         setSize(480, 600);
         panel.setLayout(null);
         panel.setBackground(new Color(217, 217, 217));
         
         addLabels();
         addCancel();
         
         setVisible (false);
    }
    
    //---------------------------------------------------------------------------------------
    // DISPLAY CANCEL TICKETS INFORMATION
    //---------------------------------------------------------------------------------------
    private void addCancel() {
    	listModel = new DefaultListModel<String>();
        ticketsField = new JList<String> (listModel);
        scrollPane = new JScrollPane(ticketsField);
        
        cancelButton = new JButton ("Cancel Ticket");
        mainMenuButton = new JButton ("Main Menu");        

        panel.add (scrollPane);
        panel.add (cancelButton);
        panel.add (mainMenuButton);

        scrollPane.setBounds (55, 65, 355, 350);
        cancelButton.setBounds (175, 450, 115, 25);
        mainMenuButton.setBounds (175, 500, 115, 25);
	}
    
    //get cancel tickets field area
    public JList<String> getTicketField() {
    	return ticketsField;
    }
	
    //get list model, used for displaying tickets
	public DefaultListModel<String> getListModel(){
    	return listModel;
    }
	
	//add cancel button listener
    public void addCancelListener(ActionListener cancel) {
    	cancelButton.addActionListener(cancel);
    }
    
    //add menu button listener
    public void addMenuListener(ActionListener menu) {
    	mainMenuButton.addActionListener(menu);
    }
    
    //---------------------------------------------------------------------------------------
    // DISPLAY LABELS
    //---------------------------------------------------------------------------------------
	private void addLabels() {
		jcomp2 = new JLabel ("Tickets Available For Cancellation");
		jcomp2.setFont(new Font("Andale Mono", Font.BOLD, 20));
    	
    	panel.add(jcomp2);
    	
    	jcomp2.setBounds (75, 15, 400, 30);
	}
	
    //---------------------------------------------------------------------------------------
    // FOR POP-UPS
    //---------------------------------------------------------------------------------------
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
    
}