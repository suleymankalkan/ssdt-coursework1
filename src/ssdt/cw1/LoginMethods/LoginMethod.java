package ssdt.cw1.LoginMethods;

public interface LoginMethod {
    String getMethodName();
    boolean isValidated();
    void setUsername(String username);

    String getUsername();
    void setSecret(String secret);

    String getSecret();
    void checkAuth();
}
// set methods