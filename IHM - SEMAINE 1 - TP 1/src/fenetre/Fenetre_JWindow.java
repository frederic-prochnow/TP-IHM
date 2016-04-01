package fenetre;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class Fenetre_JWindow {

	  public Fenetre_JWindow() {
		    JWindow fenetre = new JWindow();
		    fenetre.setPreferredSize(new Dimension(500,500));
		    fenetre.setLocation(250,250);
		    fenetre.pack();
		    fenetre.add(new JLabel("Hello World"));
		    fenetre.setVisible(true);
		  }
	  public static void main(String[] args) {
	      //Schedule a job for the event-dispatching thread:
	      //creating and showing this application’s GUI.
	      javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          new Fenetre_JWindow();
	        }
	    });
	  }
}
