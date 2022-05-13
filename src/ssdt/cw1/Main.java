package ssdt.cw1;

import ssdt.cw1.GUI.LinuxGUI;
import ssdt.cw1.GUI.WindowsGUI;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        try {
            System.out.println("Welcome to the University of Bradford Online Services!");
            System.out.println("Please select your operating system with the corresponding number.");
            System.out.println("1-) Windows  2-) Linux");
            System.out.println("Enter option:");

            // Get and set the os
            Scanner osType = new Scanner(System.in);
            int operating_system = osType.nextInt();
            if(!(operating_system == 1 || operating_system == 2)) {
                System.out.println("Please try again with a valid option.");
                return;
            }

            System.out.println("Login Options: (1).Password , (2).Email Code , (3). Sms Code || (Any other number). Exit");
            System.out.println("Please enter the corresponding number of the option that you want to use:");
            Scanner logType = new Scanner(System.in);
            int login_type = logType.nextInt();
            if(login_type > 3 || login_type < 1){
                System.out.println("Program exited.");
                return;
            }

            if(operating_system == 1){
                new WindowsGUI(login_type).main();
            } else {
                new LinuxGUI(login_type).main();
            }

        } catch (Exception e){
            throw e;
        }
        // ask for operating system
        // ask for login type
        // then initialize the gui
        //
    }


}