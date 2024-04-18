import java.awt.*;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Image img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zanatii\\Downloads\\reacTIVision\\AYproj1\\src\\resources\\test.jpg");
        g2.finalize();
    }
}

public class Graphics2DDrawImage {
    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().setBackground(Color.yellow);
                //add(new MyCanvas());
        window.setVisible(true);
    }
}