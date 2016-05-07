package potentiometre.classe_externe;
import javax.swing.*;
import javax.swing.event.*;

public class Action implements ChangeListener{
	
	protected JLabel label;
	protected JSlider slider;
	
	public Action(JLabel label) {
		this.label = label;
	}
	
	public void stateChanged(ChangeEvent e) {
		label.setText(slider.getValue()+"");
	}
}
