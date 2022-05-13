package ssdt.cw1.GUI;

import ssdt.cw1.Authentication.CreateAuth;

import javax.swing.*;
import java.awt.*;

public class LinuxGUI extends MainGUI {
    public LinuxGUI(Integer type) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        super(new CreateAuth().create(type));
        this.method_type = type;
        this.bottomPanel.setBackground(Color.RED);
        this.TopPanel.setBackground(Color.RED);
        frame.setTitle("Linux Login GUI");
    }

    public static void main() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        frame.setContentPane(new LinuxGUI(method_type).MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
