package ssdt.cw1.Authentication;

import org.junit.jupiter.api.Test;
import ssdt.cw1.LoginMethods.LoginMethod;

import static org.junit.jupiter.api.Assertions.*;

class createAuthTest {

    @Test
    void create() {
        Authenticate tester = new CreateAuth();
        assertTrue(tester.create(1) instanceof LoginMethod);
        assertTrue(tester.create(2) instanceof LoginMethod);
        assertTrue(tester.create(3) instanceof LoginMethod);
        assertFalse(tester.create(4) instanceof LoginMethod);
    }
}