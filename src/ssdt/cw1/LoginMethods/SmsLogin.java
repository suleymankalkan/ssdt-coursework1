package ssdt.cw1.LoginMethods;

import ssdt.cw1.WriteToFile;

import java.util.Objects;
import java.util.Scanner;

public class SmsLogin implements LoginMethod {
    private boolean validated = false;
    private String username;
    private String smsCode;
    private String smsCodeInput;


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
        // Set a dummy sms code for demo
        smsCode = "dummysms";
        WriteToFile.WriteOnTxtFile("sms", smsCode);

        System.out.println("Sms Code:");
        Scanner sc = new Scanner(System.in);
        smsCodeInput = sc.nextLine();
        System.out.println(smsCodeInput);
    }

    @Override
    public void checkAuth() {
        if(Objects.equals(username, "suleyman") && Objects.equals(smsCode, smsCodeInput)){
            validated = true;
        }
    }

    @Override
    public void printMethodName() {
        System.out.println("--Choosen Method: Sms login\n");
    }
}
