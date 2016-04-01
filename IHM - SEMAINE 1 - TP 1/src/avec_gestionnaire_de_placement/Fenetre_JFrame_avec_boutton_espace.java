package avec_gestionnaire_de_placement;
import java.awt.*;
import javax.swing.*;

public class Fenetre_JFrame_avec_boutton_espace {

	public Fenetre_JFrame_avec_boutton_espace() {
		JFrame fenetre = new JFrame("JFrame");
		fenetre.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //fenetre.setPreferredSize(new Dimension(500,500));
	    fenetre.setLocation(250,250);
	    //fenetre.setResizable(false);
	    GridLayout grille = new GridLayout(0,1);
	    Container panel = fenetre.getContentPane();
	    panel.setLayout(grille);
	    panel.add(new JButton("Button 1"));
	    panel.add(new JButton("Button 2"));
	    panel.add(Box.createHorizontalGlue());
	    panel.add(new JButton("Button 3"));
	    fenetre.pack();
	    fenetre.setVisible(true);
	}

	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
	      //creating and showing this application’s GUI.
	      javax.swing.SwingUtilities.invokeLater(
	    		  new Runnable() { 
	    			  public void run() {
	    				  new Fenetre_JFrame_avec_boutton_espace();
	    				  }
	    		  	}
	    	);


	}

}
