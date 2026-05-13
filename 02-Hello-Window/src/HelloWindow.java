import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWindow {

    // Fields - belong to the whole class, so later methods can all use them.
    private JFrame window;
    private JLabel nameLabel;
    private JButton button;

    // Constructor - runs when you create a new object from the class
    public HelloWindow() {
        createWindow();
        createComponents();
        addComponents();
        addButtonActions();
        showWindow();
    }

    // 1 - Create the Main Window
    public void createWindow() {
        // a - Create the main window
        window = new JFrame();
        window.setLayout(new FlowLayout());

        // b - Set window properties/settings
        window.setTitle("Hello Francisco.");
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 2 - Create the contents/Components
    public void createComponents() {
        nameLabel = new JLabel("Franciso Anaya-Alvarez",SwingConstants.CENTER);
        button = new JButton("Click Me");
    }

    // 3 -
    public void addComponents() {
        window.add(nameLabel);
        window.add(button);
    }

    public void addButtonActions(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
            }
        });
    }

    public void showWindow() {
        window.setVisible(true);
    }


    public static void main(String[] args) {

        // 0 - Console messages
        System.out.println("Hello Francisco");
        System.out.println("This is my first Java Project!");
        System.out.println();
        System.out.println("Refactored Window creation");

        new HelloWindow();

    }
}
