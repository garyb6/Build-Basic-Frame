import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Mainframe extends JFrame {
    public void init(){
        setTitle("Hello Pet");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
