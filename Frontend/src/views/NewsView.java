package views;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class NewsView extends JFrame {
	private DefaultListModel<String> listModel;
    private JList<String> moviesField;
    private JScrollPane scrollPane;
    
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel movieTitleLabel;
    private JLabel jcomp3;
    private JButton goBackButton;
    private JPanel panel;
	private JLabel movieInfoLabel;

    public NewsView() {
    	panel = new JPanel();
    	setTitle("Movie Theatre App");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setContentPane(this.panel);
        pack();
        setSize(700, 555);
        panel.setLayout(null);
        panel.setBackground(new Color(217, 217, 217));
        
        addLabels();
        addMovieInformation();
        addUpcomingMovies();
        
        setVisible (false);
    }
    
    //---------------------------------------------------------------------------------------
    // DISPLAY UPCOMING MOVIES AREA
    //---------------------------------------------------------------------------------------
    private void addUpcomingMovies() {
    	listModel = new DefaultListModel<String>();
    	moviesField = new JList<String> (listModel);
        scrollPane = new JScrollPane(moviesField);	
        
        panel.add(scrollPane);
        
        scrollPane.setBounds (65, 105, 325, 385);
	}
    
    //---------------------------------------------------------------------------------------
    // DISPLAY MOVIE INFORMATION
    //---------------------------------------------------------------------------------------
	private void addMovieInformation() {
		//String str = "<html>test<br>test</html>";
		movieTitleLabel = new JLabel ();
        goBackButton = new JButton ("Main Menu");
        movieInfoLabel  = new JLabel();
        
        panel.add(movieTitleLabel);
        panel.add(goBackButton);
        panel.add(movieInfoLabel);
        
        movieTitleLabel.setBounds (500, 130, 200, 25);
        movieInfoLabel.setBounds (425, 120, 200, 200);
        goBackButton.setBounds (515, 465, 100, 25);		
	}
	
	//---------------------------------------------------------------------------------------
    // DISPLAY LABELS
    //---------------------------------------------------------------------------------------
	private void addLabels() {
		jcomp1 = new JLabel ("Movies Coming Soon");
		jcomp1.setFont(new Font("Andale Mono", Font.BOLD, 20));
		jcomp2 = new JLabel ("Movie Title:");
		jcomp3 = new JLabel ("Movie Information:");
		
		panel.add(jcomp1);
		panel.add(jcomp2);
		panel.add(jcomp3);
		
		jcomp1.setBounds (165, 40, 250, 45);
		jcomp2.setBounds (425, 130, 100, 25);
		jcomp3.setBounds (425, 170, 105, 25);
	}
	
	
	public JLabel getMovieTitleLabel() {
		return movieTitleLabel;
	}
	public JLabel getMovieInfoLabel() {
		return movieInfoLabel;
	}
	
    public JList<String> getMoviewsField(){
    	return moviesField;
    }
    public DefaultListModel<String> getListModel(){
    	return listModel;
    }
    
    public void addMoviesListener(ListSelectionListener mov) {
    	moviesField.addListSelectionListener(mov);
    }
    
    public void addBackListener(ActionListener back) {
    	goBackButton.addActionListener(back);
    }
	//-----------------------------------------
    // FOR POP-UPS
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
}