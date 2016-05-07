package potentiometre.classe_interne;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class classe_interne {
	JFrame frame = new JFrame("Slider");
	JLabel label = new JLabel("0");
	JSlider slider = new JSlider(0,100,0);
	
	public class Action_changed implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			label.setText(slider.getValue()+"");
		}
	}
	
	public classe_interne() {
		frame.setPreferredSize(new Dimension(300,100));
		frame.getContentPane().add(label, BorderLayout.NORTH);
		frame.getContentPane().add(slider, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		slider.addChangeListener(new Action_changed());
	}
	public static void main (String[] args) {
		new classe_interne();
	}
}
