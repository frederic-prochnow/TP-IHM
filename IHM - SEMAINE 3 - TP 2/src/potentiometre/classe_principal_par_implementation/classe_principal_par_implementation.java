package potentiometre.classe_principal_par_implementation;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class classe_principal_par_implementation {
	private static final ChangeListener ChangeEvent = null;
	JFrame frame = new JFrame("Slider");
	JLabel label = new JLabel("0");
	JSlider slider = new JSlider(0,100,0);
	
	public classe_principal_par_implementation() {
		frame.setPreferredSize(new Dimension(300,100));
		frame.getContentPane().add(label, BorderLayout.NORTH);
		frame.getContentPane().add(slider, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		label.setText(slider.getValue()+"");
		slider.addChangeListener(ChangeEvent);
	}
	public static void main (String[] args) {
		new classe_principal_par_implementation();
	}
}
