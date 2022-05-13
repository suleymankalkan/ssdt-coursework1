package ssdt.cw1.GUI;

import ssdt.cw1.Authentication.CreateAuth;

import javax.swing.*;
import java.awt.*;

public class WindowsGUI extends MainGUI {
    public WindowsGUI(Integer type) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        super(new CreateAuth().create(type));
        this.method_type = type;
        this.bottomPanel.setBackground(Color.BLUE);
        this.TopPanel.setBackground(Color.BLUE);
        frame.setTitle("Windows Login GUI");
    }

    public static void main() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        frame.setContentPane(new WindowsGUI(method_type).MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
