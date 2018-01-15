
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class DrawTester extends JFrame {

    public void initialize() {

        // drawing canvas
        DrawPanel panel = new DrawPanel();
        
        Container contentPane = getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        
    }

}
