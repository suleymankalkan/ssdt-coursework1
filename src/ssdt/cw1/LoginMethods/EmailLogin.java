package ssdt.cw1.LoginMethods;

import ssdt.cw1.WriteToFile;

import java.util.Objects;

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
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername(){
        return  this.username;
    }

    @Override
    public void setSecret(String secret) {
        // Set a dummy email code for demo
        emailCode = "dummyemail";
        WriteToFile.WriteOnTxtFile("email", emailCode);

        // Set the input
        emailCodeInput = secret;
    }

    @Override
    public String getSecret() {
        return this.emailCodeInput;
    }

    @Override
    public void checkAuth() {
        if(Objects.equals(username, "suleyman") && Objects.equals(emailCode, emailCodeInput)){
            validated = true;
        }
    }

    @Override
    public String getMethodName() {
        return "Email Login";
    }
}
