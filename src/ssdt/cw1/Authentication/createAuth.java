package ssdt.cw1.Authentication;

import ssdt.cw1.LoginMethods.EmailLogin;
import ssdt.cw1.LoginMethods.LoginMethod;
import ssdt.cw1.LoginMethods.PasswordLogin;
import ssdt.cw1.LoginMethods.SmsLogin;

public class createAuth extends Authenticate{
    @Override
    public LoginMethod create(int type){
        if(type == 1){
            return new PasswordLogin();
        } else if (type == 2) {
            return new EmailLogin();
        } else if (type == 3) {
            return new SmsLogin();
        } else {
            return null;
        }
    }
}
