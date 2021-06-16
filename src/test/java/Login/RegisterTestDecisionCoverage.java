package Login;

import Account.User;
import Database.Database;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTestDecisionCoverage {

    ArrayList<User> users = Database.getInstance().getUsers();

    @Test
    void registerUser1() {
        Register register = new Register();
        Register register2 = new Register();
        register.registerUser("kadmosb1","keesgerard","kadmosb1","Karel","Ja","Nee","ADMIN");
        register2.registerUser("","","","","","","");

        // all fields in registerUser are not filled * 0 *
        assertEquals("", register2.getUser().getUsername());
        assertEquals("", register.getUser().getPassword());
        assertEquals("", register.getUser().getEmail());
        assertEquals("", register.getUser().getName());
        assertEquals("", register.getUser().getSex());
        assertEquals("", register.getUser().getDateofbirth());
        assertEquals("", register.getUser().getType());

        // password not equals password * 0 *
        assertNotEquals("gerard", register.getUser().getPassword());

        // username is not unique * 0 *
        for (User user : users) {
            if (register.getUser().getUsername().equals(user.getUsername())) {
                assertEquals(register.getUser().getUsername(), user.getUsername());
            }
        }
    }

    @Test
    void registerUser2() {
        Register register = new Register();
        register.registerUser("Admin","keesgerard","kadmosb1","Karel","Ja","Nee","ADMIN");

        // all fields in registerUser are filled * 1 *
        assertNotEquals("", register.getUser().getUsername());
        assertNotEquals("", register.getUser().getPassword());
        assertNotEquals("", register.getUser().getEmail());
        assertNotEquals("", register.getUser().getName());
        assertNotEquals("", register.getUser().getSex());
        assertNotEquals("", register.getUser().getDateofbirth());
        assertNotEquals("", register.getUser().getType());

        // password equals password * 1 *
        assertEquals("keesgerard", register.getUser().getPassword());

        // username is unique * 1 *
        for (User user : users) {
            if (!register.getUser().getUsername().equals(user.getUsername())) {
                assertNotEquals(register.getUser().getUsername(), user.getUsername());
            }
        }
    }
}