import java.awt.Dimension;

import javax.swing.JFrame;

public class HelloPaint {
        public HelloPaint() {
                JFrame f = new JFrame("Hello Paint");
                f.setPreferredSize(new Dimension(300,300));
                f.getContentPane().add(new Canvas());
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.pack();
                f.setVisible(true);
        }

        public static void main(String args[]){
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                                new HelloPaint();
                        }
                });
        }
}