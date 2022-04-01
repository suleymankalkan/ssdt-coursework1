package ssdt.cw1;
import ssdt.cw1.Authentication.Authenticate;
import ssdt.cw1.Authentication.createAuth;

import java.util.Scanner;

public class Main {
    public static int choosen_login_method;
    public static boolean validated = false;

    public static void main(String[] args) {
        while(!validated){
            try {
                printLoginMessage();
                getChoosenLoginMethod();
                executeAuthValidation();
                checkValidation();
            } catch (Exception e) {
                continue;
            }
        }
    }

    public static void printLoginMessage(){
        System.out.println("Welcome to the University of Bradford Online Services!");
        System.out.println("Before continuing to the online services, you must login first.\n");
    }

    public static void getChoosenLoginMethod(){
        try {
            System.out.println("Login Options: (1).Password , (2).Email Code , (3). Sms Code (Any other number). Exit");
            System.out.println("Please enter the number of the option that you want to use:");
            Scanner sc = new Scanner(System.in);
            choosen_login_method = sc.nextInt();
        } catch (Exception e) {
            System.out.println("------Please choose an accepted option.------\n");
            throw e;
        }
    }

    public static void executeAuthValidation() throws Exception {
        if(choosen_login_method > 3) {
            System.out.println("Good bye!");
            System.exit(0);
        }
        try {
            createAuth validator = new createAuth();
            validated = validator.processAuth(choosen_login_method);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void checkValidation() throws Exception {
        // check if user is validated or not
        if(validated){
            //if he logged in, show welcome message,
            System.out.println("Successfully logged in. \n \n Welcome to University of Bradford Online Services!");
        } else {
            // if he is not logged in, print out try again and throw an exception
            System.out.println("Login failed! Please try again.");
            throw new Exception("Login failed");
        }
    }
}