import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Image img1 = Toolkit.getDefaultToolkit().getImage("/resources/test.jpg");
        g2.finalize();
    }
}

public class Graphics2DDrawImage {
    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);
    }
}