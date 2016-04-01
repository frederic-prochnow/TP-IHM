package test;
import javax.swing.*;
import java.awt.Dimension;

public class Test {

  public Test() {
    JFrame fenetre = new JFrame("Test");
    fenetre.setPreferredSize(new Dimension(300,100));
    fenetre.pack();
    fenetre.setVisible(true);
  }

  public static void main(String[] args) {
      //Schedule a job for the event-dispatching thread:
      //creating and showing this application’s GUI.
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new Test();
        }
    });
  }
}