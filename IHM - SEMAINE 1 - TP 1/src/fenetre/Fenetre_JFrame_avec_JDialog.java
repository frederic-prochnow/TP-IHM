package fenetre;
import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre_JFrame_avec_JDialog {
	 
	public Fenetre_JFrame_avec_JDialog() {
		    JFrame fenetre = new JFrame("JFrame");
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    fenetre.setPreferredSize(new Dimension(500,500));
		    fenetre.setLocation(250,250);
		    //empeche le redimensionnement de la fenetre
		    fenetre.setResizable(false);
		    fenetre.pack();
		    fenetre.add(new JLabel("Hello World"));
		    fenetre.setVisible(true);
		    
		    JDialog fenetre2 = new JDialog(fenetre,"JDialog",true);
		    fenetre.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		    fenetre2.setLocation(350, 350);
		    fenetre2.setPreferredSize(new Dimension(250,250));
		    fenetre2.setResizable(false);
		    fenetre2.pack();
		    fenetre2.setVisible(true);
		  }
	
	  public static void main(String[] args) {
	      //Schedule a job for the event-dispatching thread:
	      //creating and showing this application’s GUI.
	      javax.swing.SwingUtilities.invokeLater(
	    		  new Runnable() { 
	    			  public void run() {
	    				  new Fenetre_JFrame_avec_JDialog();
	    				  }
	    		  	}
	    	);
	  }
}
