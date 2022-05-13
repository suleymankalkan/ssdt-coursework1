package ssdt.cw1.LoginMethods;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ssdt.cw1.Authentication.CreateAuth;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SmsLoginTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    static Authenticate tester;
    static LoginMethod login;

    @BeforeAll
    static void setData(){
        tester = new CreateAuth();
        login = tester.create(3);
    }

    @Test
    void isValidated() {
        assertEquals(false, login.isValidated());
    }

    @Test
    <InputOutput>
    void getUsername() {
        ByteArrayInputStream argumentsIn = new ByteArrayInputStream("suleyman".getBytes());
        System.setIn(argumentsIn);
        login.setUsername();
    }

    @Test
    void getSecret() {
        ByteArrayInputStream argumentsIn = new ByteArrayInputStream("dummypassword".getBytes());
        System.setIn(argumentsIn);
        login.setSecret();
    }

    @Test
    void checkAuth() {
        assertEquals(false, login.isValidated());
    }

    @Test
    void printMethodName() {
        login.getMethodName();
        assertEquals("--Choosen Method: Sms login\n\n", outContent.toString());
    }

}