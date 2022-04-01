package ssdt.cw1.LoginMethods;

import ssdt.cw1.WriteToFile;

import java.util.Objects;
import java.util.Scanner;

public class EmailLogin implements LoginMethod {
    private boolean validated = false;
    private String username;
    private String emailCode;
    private String emailCodeInput;


    @Override
    public boolean isValidated(){
        return validated;
    }

    @Override
    public void getUsername() {
        System.out.println("Username:");
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();
        System.out.println(username);
    }

    @Override
    public void getSecret() {
        // Set a dummy email code for demo
        emailCode = "dummyemail";
        WriteToFile.WriteOnTxtFile("email", emailCode);

        System.out.println("Email Code:");
        Scanner sc = new Scanner(System.in);
        emailCodeInput = sc.nextLine();
        System.out.println(emailCodeInput);
    }

    @Override
    public void checkAuth() {
        if(Objects.equals(username, "suleyman") && Objects.equals(emailCode, emailCodeInput)){
            validated = true;
        }
    }

    @Override
    public void printMethodName() {
        System.out.println("--Choosen Method: Email Login\n");
    }
}
