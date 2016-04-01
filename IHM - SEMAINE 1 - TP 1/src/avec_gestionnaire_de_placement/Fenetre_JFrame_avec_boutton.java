package avec_gestionnaire_de_placement;
import java.awt.*;
import javax.swing.JFrame;

public class Fenetre_JFrame_avec_boutton {

	public Fenetre_JFrame_avec_boutton() {
		 JFrame fenetre = new JFrame("JFrame");
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    fenetre.setPreferredSize(new Dimension(500,500));
		    fenetre.setLocation(250,250);
		    fenetre.setResizable(false);
		    fenetre.setLayout(new BorderLayout());
		    fenetre.add(new Button("Nord"), BorderLayout.NORTH);
		    fenetre.add(new Button("Sud"), BorderLayout.SOUTH);
		    fenetre.add(new Button("Ouest"), BorderLayout.WEST);
		    fenetre.add(new Button("Est"), BorderLayout.EAST);
		    fenetre.add(new Button("Centre"), BorderLayout.CENTER);
		    fenetre.pack();
		    fenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
	      //creating and showing this application’s GUI.
	      javax.swing.SwingUtilities.invokeLater(
	    		  new Runnable() { 
	    			  public void run() {
	    				  new Fenetre_JFrame_avec_boutton();
	    				  }
	    		  	}
	    	);

	}

}
