
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Float r = new Rectangle2D.Float(20, 20, 50, 90);
        g2.setColor(Color.blue);
        g2.fill(r); // g2.draw( ) draws outline only

        g2.setColor(Color.red);
        g2.setFont(new Font("Courier New", Font.BOLD, 30));
        g2.drawString("A String is drawn", 50, 100);

        g2.setColor(Color.green);
        g2.setFont(new Font("Arial", Font.BOLD, 50));
        g2.drawString("Another String", 50, 200);

    }
}
