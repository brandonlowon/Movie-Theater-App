package viewcontrollers;

import views.SeatView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SeatViewController {

	private SeatView view;
	private GUIController guiController;

	public SeatViewController(GUIController control) {
		guiController = control;
		view = new SeatView();
		view.addSelectButton(new selectButton());
		view.addBackButton(new goBackButton());
		view.addButtonSeat1(new addButton1());
		view.addButtonSeat2(new addButton2());
		view.addButtonSeat3(new addButton3());
		view.addButtonSeat4(new addButton4());
		view.addButtonSeat5(new addButton5());
		view.addButtonSeat6(new addButton6());
		view.addButtonSeat7(new addButton7());
		view.addButtonSeat8(new addButton8());
		view.addButtonSeat9(new addButton9());
		view.addButtonSeat10(new addButton10());
		view.addButtonSeat11(new addButton11());
		view.addButtonSeat12(new addButton12());
		view.addButtonSeat13(new addButton13());
		view.addButtonSeat14(new addButton14());
		view.addButtonSeat15(new addButton15());
		view.addButtonSeat16(new addButton16());
		view.addButtonSeat17(new addButton17());
		view.addButtonSeat18(new addButton18());
		view.addButtonSeat19(new addButton19());
		view.addButtonSeat20(new addButton20());
	}

	public void showGUI() {
		view.setVisible(true);
	}

	public class addButton1 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat1();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public void setGuiController(GUIController guiController){
	    this.guiController = guiController;
	}
	public class addButton2 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat2();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton3 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat3();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton4 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat4();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton5 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat5();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton6 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat6();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton7 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat7();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton8 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat8();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton9 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat9();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton10 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat10();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton11 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat11();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton12 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat12();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton13 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat13();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}public class addButton14 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat14();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton15 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat15();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton16 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat16();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton17 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat17();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton18 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat18();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton19 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b = view.getSeat19();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}
	public class addButton20 implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        JButton b  = view.getSeat20();
	        b.setOpaque(true);
	        b.setBorderPainted(false);
	        if(b.getBackground() == Color.red){
	            b.setBackground(Color.white);
	        }else{
	            b.setBackground(Color.red);
	        }
	    }
	}

    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(view, errMessage);
    }
	
	public class selectButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			view.setVisible(false);
			int command = 5;
			
			if(guiController.isRegistered) {
				String movie = guiController.getRmc().getView().getMovieChoice().getSelectedItem().toString();

				// Search Upcoming movie list for movie of the same name
				if(guiController.getApp().searchUpcomingMoviesList(movie)) {
					
					// Scan
					if((scanButtonsBooked() + scanButtonsSelected()) < 3) {
						guiController.getApp().getDollarAmount(scanButtons());
						guiController.receiveRequestFromGUI(command, " ");
					} else {
						showError("You have gone over the limit for advance booking of seats!");
						view.setVisible(true);
					}
				} else {
					guiController.getApp().getDollarAmount(scanButtons());
					guiController.receiveRequestFromGUI(command, " ");
				}
				
			} else {
				guiController.getApp().getDollarAmount(scanButtons());
				guiController.receiveRequestFromGUI(command, " ");
			}
		}
	}
	public class goBackButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int command = 7;
			view.setVisible(false);
			guiController.receiveRequestFromGUI(command, "");
		
		}
	}
	
	public ArrayList<Integer> scanButtons(){
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(JButton i : view.getListOfButton()) {
			if(i.getBackground() == Color.red) {
				array.add(Integer.parseInt(i.getText()));
			}
		}
		return array;
		
	}


	public int scanButtonsBooked(){
		int numBooked = 0;
		for(JButton i : view.getListOfButton()) {
			if(i.getBackground() == Color.black) {
				numBooked++;
			}
		}
		return numBooked;
		
	}
	
	public int scanButtonsSelected(){
		int numBooked = 0;
		for(JButton i : view.getListOfButton()) {
			if(i.getBackground() == Color.RED) {
				numBooked++;
			}
		}
		return numBooked;
		
	}
	public void setSeatColour(ArrayList<Integer> bookedSeats) {
		for(JButton i: view.getListOfButton()) {
			i.setBackground(Color.WHITE);
			i.setEnabled(true);
		}
		
		for (int i : bookedSeats) {
			for (JButton j : view.getListOfButton())
				if (i == Integer.parseInt(j.getText())) {
					j.setBackground(Color.black);
					j.setEnabled(false);
				}

		}

	}
}
