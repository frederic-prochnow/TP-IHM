

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Jeu {
	public Jeu() {
        JFrame f = new JFrame("Jeu");
        f.setPreferredSize(new Dimension(400,400));
		f.getContentPane().add(new Canvas());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
}

	public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                        new Jeu();
                }
        	}
        );
	}
}
