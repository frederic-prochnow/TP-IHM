package potentiometre.classe_interne_anonyme;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class classe_interne_anonyme {
	JFrame frame = new JFrame("Slider");
	JLabel label = new JLabel("0");
	JSlider slider = new JSlider(0,100,0);
	
	public classe_interne_anonyme() {
		frame.setPreferredSize(new Dimension(300,100));
		frame.getContentPane().add(label, BorderLayout.NORTH);
		frame.getContentPane().add(slider, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				label.setText(slider.getValue()+"");
			}
		});
	}
	public static void main (String[] args) {
		new classe_interne_anonyme();
	}
}
