package ssdt.cw1.GUI;

import ssdt.cw1.LoginMethods.LoginMethod;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    public JPanel MainPanel;
    public JPanel TopPanel;
    public JPanel bottomPanel;
    private JTextField secretField;
    private JTextField resultField;
    private JTextField usernameField;
    private JButton LOGINButton;
    private JButton CLEARButton;
    private JLabel methodNameField;
    public static JFrame frame = new JFrame("MainGUI");
    
    public LoginMethod method;

    public static Integer method_type;
    public MainGUI(LoginMethod method) {
        this.method = method;
        methodNameField.setText(method.getMethodName());

        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String secret = secretField.getText().trim();
                method.setUsername(username);
                method.setSecret(secret);
                method.checkAuth();
                boolean loginResult = method.isValidated();

                if(loginResult){
                    resultField.setText("Login successfull!");
                } else {
                    resultField.setText("Login failed. Please try again.");
                }
                //resultField.setText(result+"");
            }
        });
        CLEARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                secretField.setText("");
                resultField.setText("");
            }
        });
    }


}
