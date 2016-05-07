package compteur.classe_avec_mouseListener;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class classe_avec_mouseListener implements MouseListener{
	int compteur;
	JFrame frame = new JFrame("Slider");
	JLabel label = new JLabel("0");
	
	classe_avec_mouseListener(int compteur) {
		this.compteur = compteur;
		frame.setPreferredSize(new Dimension(300,100));
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main (String[] args) {
		new classe_avec_mouseListener(10);
	}
	
	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == 1) {
			compteur += 1;
			label.setText(compteur+"");
		}
		if(e.getButton() == 3) {
			compteur -= 1;
			label.setText(compteur+"");
		}
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

}
