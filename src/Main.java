
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        DrawTester frame = new DrawTester();
        
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setTitle("Draw Test 2");
        frame.initialize();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
