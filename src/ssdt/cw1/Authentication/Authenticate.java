package ssdt.cw1.Authentication;


import ssdt.cw1.LoginMethods.LoginMethod;

// import button interface in here
public abstract class Authenticate {
    public boolean processAuth(int type) throws Exception {
        try {
            LoginMethod method = create(type);
            method.printMethodName();
            method.getUsername();
            method.getSecret();
            method.checkAuth();
            return method.isValidated();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    public abstract LoginMethod create(int type);
//    public static String methodName;
//    /*
//
//    */
//
//
//    public abstract void printAuthPrompt();
//    public abstract LoginMethod printAuthPrompt2();
//    public abstract LoginMethod printAuthPrompt4();
}
