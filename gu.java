import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class log extends JFrame implements ActionListener{
    Container con=getContentPane();
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passLabel=new JLabel("PASSWORD");
    JTextField userText=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginBtn=new JButton("Login");
    log(){
        setlayoutManager();
        setLocaleAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
    public void setlayoutManager(){
        con.setLayout(null);
    }
    public void setLocaleAndSize(){
        userLabel.setBounds(50,150,100,30);
        passLabel.setBounds(50,220,100,30);
        userText.setBounds(150,250,250,30);
        passwordField.setBounds(150,220,150,30);
        loginBtn.setBounds(150,300,100,30);
    }
    public void addComponentsToContainer(){
        con.add(userLabel);
        con.add(passLabel);
        con.add(userText);
        con.add(passwordField);
        con.add(loginBtn);
    }
    public void addActionEvent(){
        loginBtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==loginBtn){
            String text;
            text=userText.getText();
            String pwdText = passwordField.getText();
            if(text.equalsIgnoreCase("abc")&& pwdText.equalsIgnoreCase("1234")) {
                JOptionPane.showMessageDialog(this, "Login Success");
            }else {
                JOptionPane.showMessageDialog(this, "Invalid");
            }
        }
    }
}
public class gu{
    public static void main(String[] args){
        Log frame=new Log();
        frame.setTitle("LoginFrame");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
}

}
