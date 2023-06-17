import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {
    private static JLabel user;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JFrame frame1= new JFrame();

        frame1.setSize(350,200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1= new JPanel();
        frame1.add(panel1);

        panel1.setLayout(null);
        user= new JLabel("User Name:");
        user.setBounds(10,20,80,25);
        panel1.add(user);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel1.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel1.add(passwordLabel);

         passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel1.add(passwordText);

         button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new GUI());
        panel1.add(button);

         success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel1.add(success);
        frame1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user= userText.getText();
        String password= passwordText.getText();
        System.out.println(user+","+password);

        if (user.equals("Suzi") && password.equals("Pinkflowers"))
        {
            success.setText("Login Successful!");
        }

    }
}
