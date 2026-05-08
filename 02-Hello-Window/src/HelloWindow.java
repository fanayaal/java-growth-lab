import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloWindow {
    public static void main(String[] args) {
        System.out.println("Hello Francisco");
        System.out.println("This is my first Java Project!");

        JFrame window = new JFrame();
        JLabel nameLabel = new JLabel("Francisco Anaya-Alvarez",SwingConstants.CENTER);

        window.add(nameLabel);
        window.setTitle("Hello Francisco.");

        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
