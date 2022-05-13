package ssdt.cw1.LoginMethods;

import java.util.Objects;

public class PasswordLogin implements LoginMethod {
    private boolean validated = false;
    private String username;
    private String password;

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
        this.password = secret;
    }

    public String getSecret(){
        return  this.password;
    }

    @Override
    public void checkAuth() {
        if(Objects.equals(username, "suleyman") && Objects.equals(password, "dummypassword")){
            validated = true;
        } else {
            validated = false;
        }
    }

    @Override
    public String getMethodName() {
        return "Password Login";
    }
}
