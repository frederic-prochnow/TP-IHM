package potentiometre.classe_externe;
import java.awt.*;
import javax.swing.*;

import potentiometre.classe_interne_anonyme.classe_interne_anonyme;

public class classe_externe {
	JFrame frame = new JFrame("Slider");
	JLabel label = new JLabel("0");
	JSlider slider = new JSlider(0,100,0);
	
	public classe_externe() {
		frame.setPreferredSize(new Dimension(300,100));
		frame.getContentPane().add(label, BorderLayout.NORTH);
		frame.getContentPane().add(slider, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		slider.addChangeListener(new Action(label));
	}
	
	public static void main (String[] args) {
		new classe_interne_anonyme();
	}
}
