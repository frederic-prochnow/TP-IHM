package sans_gestionnaire_de_placement;
import java.awt.*;
import javax.swing.*;

public class Fenetre_JFrame_avec_boutton_absolu {

	public Fenetre_JFrame_avec_boutton_absolu() {
		JFrame fenetre = new JFrame("JFrame");
		fenetre.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setPreferredSize(new Dimension(500,500));
	    fenetre.setLocation(250,250);
	    //fenetre.setResizable(false);
	    Container panel = fenetre.getContentPane();
	    panel.setLayout(null);
	    panel.add(new JButton("Button 1")).setBounds(0, 0, 50, 50);
	    panel.add(new JButton("Button 2")).setBounds(50, 50, 50, 50);
	    panel.add(new JButton("Button 3")).setBounds(100,100, 50, 50);
	    panel.add(new JButton("Button 4")).setBounds(150, 150, 50, 50);
	    panel.add(new JButton("Button 5")).setBounds(200, 200, 50, 50);
	    panel.add(new JButton("Button 6")).setBounds(250, 250, 50, 50);
	    panel.add(new JButton("Button 7")).setBounds(300, 300, 50, 50);
	    panel.add(new JButton("Button 8")).setBounds(350, 350, 50, 50);
	    panel.add(new JButton("Button 9")).setBounds(400, 400, 50, 50);;
	    fenetre.pack();
	    fenetre.setVisible(true);
	}

	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
	      //creating and showing this application’s GUI.
	      javax.swing.SwingUtilities.invokeLater(
	    		  new Runnable() { 
	    			  public void run() {
	    				  new Fenetre_JFrame_avec_boutton_absolu();
	    				  }
	    		  	}
	    	);

	}

}
