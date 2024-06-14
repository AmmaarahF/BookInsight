import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    private JTextField textField2;
    private JTextField textField1;
    private JButton LOGINButton;
    private JPanel loginPanel;

    public LoginForm() {
        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(800, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
            loginForm.setLocationRelativeTo(null);
        });
    }
}





