package ssdt.cw1.LoginMethods;

import ssdt.cw1.WriteToFile;

import java.util.Objects;

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
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setSecret(String secret) {
        // Set a dummy sms code for demo
        smsCode = "dummysms";
        WriteToFile.WriteOnTxtFile("sms", smsCode);

        smsCodeInput = secret;
    }
    @Override
    public String getSecret() {
        return this.smsCodeInput;
    }

    @Override
    public void checkAuth() {
        if(Objects.equals(username, "suleyman") && Objects.equals(smsCode, smsCodeInput)){
            validated = true;
        }
    }

    @Override
    public String getMethodName() {
        return "SMS Login";
    }
}
