package avec_gestionnaire_de_placement;
import java.awt.*;
import javax.swing.*;

public class Fenetre_JFrame_avec_boutton_centre {

	public Fenetre_JFrame_avec_boutton_centre() {
		JFrame fenetre = new JFrame("JFrame");
		fenetre.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setPreferredSize(new Dimension(500,500));
	    fenetre.setLocation(250,250);
	    //fenetre.setResizable(false);
	    Container panel = fenetre.getContentPane();
	    panel.add(new JButton("Button 1"));
	    panel.add(new JButton("Button 2"));
	    panel.add(new JButton("Button 3"));
	    panel.add(new JButton("Button 4"));
	    panel.add(new JButton("Button 5"));
	    panel.add(new JButton("Button 6"));
	    panel.add(new JButton("Button 7"));
	    panel.add(new JButton("Button 8"));
	    panel.add(new JButton("Button 9"));
	    panel.add(new JButton("Button 10"));
	    panel.add(new JButton("Button 11"));
	    panel.add(new JButton("Button 12"));
	    panel.add(new JButton("Button 13"));
	    panel.add(new JButton("Button 14"));
	    panel.add(new JButton("Button 15"));
	    panel.add(new JButton("Button 16"));
	    fenetre.pack();
	    fenetre.setVisible(true);
	}

	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
	      //creating and showing this application’s GUI.
	      javax.swing.SwingUtilities.invokeLater(
	    		  new Runnable() { 
	    			  public void run() {
	    				  new Fenetre_JFrame_avec_boutton_centre();
	    				  }
	    		  	}
	    	);

	}

}
