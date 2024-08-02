
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Logi extends JFrame implements ActionListener {
    Container con = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passLabel = new JLabel("PASSWORD");
    JTextField userText = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginBtn = new JButton("Login");

    Logi() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        con.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passLabel.setBounds(50, 220, 100, 30);
        userText.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        loginBtn.setBounds(150, 300, 100, 30);
    }

    public void addComponentsToContainer() {
        con.add(userLabel);
        con.add(passLabel);
        con.add(userText);
        con.add(passwordField);
        con.add(loginBtn);
    }

    public void addActionEvent() {
        loginBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            String text = userText.getText();
            String pwdText = new String(passwordField.getPassword()); // Retrieve password correctly
            if (text.equalsIgnoreCase("abc") && pwdText.equals("1234")) { // Use .equals() for comparing strings
                JOptionPane.showMessageDialog(this, "Login Success");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid");
            }
        }
    }
}

public class logins {
    public static void main(String[] args) {
        lp frame = new lp();
        frame.setTitle("LoginFrame");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 500); // Adjusted height to fit components
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
}
