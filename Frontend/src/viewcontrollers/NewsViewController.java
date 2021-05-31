package viewcontrollers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.Movie;
import views.NewsView;

public class NewsViewController {
	private GUIController gui;
	private NewsView view;
	
	public NewsViewController(GUIController gui) {
		this.gui = gui;
		view = new NewsView();
		addListeners();
	}
	
	public void showGUI() {		
		//populate the upcoming movies
		DefaultListModel<String> list = view.getListModel();
		list.removeAllElements();
		for(Movie i: gui.getApp().getUpcomingMovies().getMovieList()) {
			list.addElement(i.getMovieTitle());
		}
		
		view.setVisible(true);
	}

	private void addListeners() {
		//populate movie info on select
		view.addMoviesListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				Movie movie = gui.getApp().getUpcomingMovies().searchUpcomingMovie(view.getMoviewsField().getSelectedValue());
				if(movie != null) {
					String title = movie.getMovieTitle();
					String info = "<html>Rating: "+movie.getMovieRating()+" stars<br>Runtime: "+movie.getRunTime()+" mins</html>";
					//getUpcoming movie info
					view.getMovieTitleLabel().setText(title);
					view.getMovieInfoLabel().setText(info);
				}
			}			
		});
		
		// go back to main menu
		view.addBackListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				gui.receiveRequestFromGUI(0, "");
			}
		});
	}
	
	public void showError(String errMessage) {
        JOptionPane.showMessageDialog(view, errMessage);
    }
}
