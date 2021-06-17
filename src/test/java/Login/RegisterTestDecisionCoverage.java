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
        assertEquals("", Database.getInstance().getUsers().get(4).getUsername());
        assertEquals("", Database.getInstance().getUsers().get(4).getPassword());
        assertEquals("", Database.getInstance().getUsers().get(4).getEmail());
        assertEquals("", Database.getInstance().getUsers().get(4).getName());
        assertEquals("", Database.getInstance().getUsers().get(4).getSex());
        assertEquals("", Database.getInstance().getUsers().get(4).getDateOfBirth());
        assertEquals("", Database.getInstance().getUsers().get(4).getType());

        // password not equals password * 0 *
        assertNotEquals("gerard", Database.getInstance().getUsers().get(3).getPassword());

        // username is not unique * 0 *
        for (User user : users) {
            if (Database.getInstance().getUsers().get(3).getUsername().equals(user.getUsername())) {
                assertEquals(Database.getInstance().getUsers().get(3).getUsername(), user.getUsername());
            }
        }
    }

    @Test
    void registerUser2() {
        Register register = new Register();
        register.registerUser("Admin","keesgerard","kadmosb1","Karel","Ja","Nee","ADMIN");

        // all fields in registerUser are filled * 1 *
        assertNotEquals("", Database.getInstance().getUsers().get(3).getUsername());
        assertNotEquals("", Database.getInstance().getUsers().get(3).getPassword());
        assertNotEquals("", Database.getInstance().getUsers().get(3).getEmail());
        assertNotEquals("", Database.getInstance().getUsers().get(3).getName());
        assertNotEquals("", Database.getInstance().getUsers().get(3).getSex());
        assertNotEquals("", Database.getInstance().getUsers().get(3).getDateOfBirth());
        assertNotEquals("", Database.getInstance().getUsers().get(3).getType());

        // password equals password * 1 *
        assertEquals("keesgerard", Database.getInstance().getUsers().get(3).getPassword());

        // username is unique * 1 *
        for (User user : users) {
            if (!Database.getInstance().getUsers().get(3).getUsername().equals(user.getUsername())) {
                assertNotEquals(Database.getInstance().getUsers().get(3).getUsername(), user.getUsername());
            }
        }
    }
}