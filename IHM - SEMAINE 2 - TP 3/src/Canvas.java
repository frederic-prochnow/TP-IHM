
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;

public class Canvas extends JPanel implements MouseListener{
	
	
	public Canvas() {
		this.addMouseListener(this);
	}

	private int x;
	private int y;
	private ArrayList<Rectangle> liste = new ArrayList<>();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.WHITE);
		for(int i=0; i<liste.size();i++) {
			Rectangle r = liste.get(i);
			g.setColor(Color.ORANGE);
			g.fillRect((int)r.getHeight(), (int)r.getWidth(),
					(int)r.getX(), (int)r.getY());
			g.setColor(Color.BLACK);
			g.drawRect((int)r.getHeight(), (int)r.getWidth(),
					(int)r.getX(), (int)r.getY());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			//BOUTTON 1 : AJOUT
			//liste.add(new Rectangle(e.getX(),e.getY(),20,20));
			liste.add(new Rectangle(20,20,e.getY(),e.getX()));
			
		}
		if (e.getButton() == MouseEvent.BUTTON3) {
			//BOUTTON 2 : Suppression
			//Rectangle r = new Rectangle(e.getX(),e.getY(),20,20);
			Rectangle r = new Rectangle(20,20,e.getY(),e.getX());
			for(int i=0; i<liste.size(); i++) {
				Rectangle r2 = liste.get(i);
				if(r.equals(r2)){
					liste.remove(i);
				}
			}
		}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}    	
}	
