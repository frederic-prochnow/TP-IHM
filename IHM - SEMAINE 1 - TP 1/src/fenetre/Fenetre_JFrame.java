package fenetre;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre_JFrame {
	 
	public Fenetre_JFrame() {
		    JFrame fenetre = new JFrame("JFrame");
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   //fenetre.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		    fenetre.setPreferredSize(new Dimension(500,500));
		    fenetre.setLocation(250,250);
		    //empeche le redimensionnement de la fenetre
		    fenetre.setResizable(false);
		    fenetre.pack();
		    fenetre.add(new JLabel("Hello World"));
		    fenetre.setVisible(true);
		  }
	  public static void main(String[] args) {
	      //Schedule a job for the event-dispatching thread:
	      //creating and showing this application’s GUI.
	      javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          new Fenetre_JFrame();
	        }
	    });
	  }
}
