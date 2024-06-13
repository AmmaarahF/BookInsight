import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JDialog{
    private JTextField regName;
    private JTextField regEmail;
    private JPasswordField regPassword;
    private JButton signUpButton;
    private JButton loginButton;
    private JPanel registerPanel;

    public RegistrationForm(JFrame parent){
        super(parent);
        setTitle("Register");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(850, 550));
        setModal(true);
        setLocationRelativeTo(parent);

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        setVisible(true);
    }
    private void registerUser() {
        String name = regName.getText();
        String email = regEmail.getText();
        String password = String.valueOf(regPassword.getPassword());

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter all fields" , "Try Again", JOptionPane.ERROR_MESSAGE);
            return;
        }


    }

    public static void main(String[] args){
        RegistrationForm regForm = new RegistrationForm(null);
    }

}
