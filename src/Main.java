
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        DrawTester frame = new DrawTester();
        frame.initialize();
        frame.setSize(500, 500);
        frame.setLocation(100, 100);
        frame.setTitle("Draw Test 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
