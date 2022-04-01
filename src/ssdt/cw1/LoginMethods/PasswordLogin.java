package ssdt.cw1.LoginMethods;

import java.util.Objects;
import java.util.Scanner;

public class PasswordLogin implements LoginMethod {
    private boolean validated = false;
    private String username;
    private String password;

    @Override
    public boolean isValidated(){
        return validated;
    }

    @Override
    public double getUsername() {
        System.out.println("Username:");
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();
        System.out.println(username);
        return 0;
    }

    @Override
    public void getSecret() {
        System.out.println("Password:");
        Scanner sc = new Scanner(System.in);
        password = sc.nextLine();
        System.out.println(password);
    }

    @Override
    public void checkAuth() {
        if(Objects.equals(username, "suleyman") && Objects.equals(password, "dummypassword")){
            validated = true;
        }
    }

    @Override
    public void printMethodName() {
        System.out.println("--Choosen Method: Password Login \n");
    }
}
