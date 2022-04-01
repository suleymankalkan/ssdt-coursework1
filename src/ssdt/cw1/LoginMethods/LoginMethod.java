package ssdt.cw1.LoginMethods;

public interface LoginMethod {
    void printMethodName();
    boolean isValidated();
    double getUsername();
    void getSecret();
    void checkAuth();
    // variable: static methodName
    // printAuthPrompt
    // getSecret
    // checkAuth
}
