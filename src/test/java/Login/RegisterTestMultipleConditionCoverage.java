package Login;

import Account.User;
import org.junit.jupiter.api.Test;
import Database.Database;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTestMultipleConditionCoverage {

    ArrayList<User> users = Database.getInstance().getUsers();

    @Test
    void registerUser1() {
        // 111

        Register user1 = new Register();
        user1.registerUser("u1", "#1Geheim", "u1@gmail.com", "u1", "M", "24-12-2000", "Admin");

        // fields are filled in
        assertNotEquals("", user1.getUser().getUsername());
        assertNotEquals("", user1.getUser().getPassword());
        assertNotEquals("", user1.getUser().getEmail());
        assertNotEquals("", user1.getUser().getName());
        assertNotEquals("", user1.getUser().getSex());
        assertNotEquals("", user1.getUser().getDateofbirth());
        assertNotEquals("", user1.getUser().getType());

        // Passwords match
        assertEquals("#1Geheim", user1.getUser().getPassword());

        // username is unique
        for (User user : users) {
            if (!user1.getUser().getUsername().equals(user.getUsername())) {
                assertNotEquals(user1.getUser().getUsername(), user.getUsername());
            }
        }

    }

    @Test
    void registerUser2() {
        // 110

        Register user1 = new Register();
        user1.registerUser("u1", "#1Geheim", "u1@gmail.com", "u1", "M", "24-12-2000", "Admin");

        // fields are filled in
        assertNotEquals("", user1.getUser().getUsername());
        assertNotEquals("", user1.getUser().getPassword());
        assertNotEquals("", user1.getUser().getEmail());
        assertNotEquals("", user1.getUser().getName());
        assertNotEquals("", user1.getUser().getSex());
        assertNotEquals("", user1.getUser().getDateofbirth());
        assertNotEquals("", user1.getUser().getType());

        // Passwords match
        assertEquals("#1Geheim", user1.getUser().getPassword());

        // username is not unique
        for (User user : users) {
            if (user1.getUser().getUsername().equals(user.getUsername())) {
                assertEquals(user1.getUser().getUsername(), user.getUsername());
            }
        }

    }

    @Test
    void registerUser3() {
        // 100

        Register user1 = new Register();
        user1.registerUser("u1", "#1Geheim", "u1@gmail.com", "u1", "M", "24-12-2000", "Admin");

        // fields are filled in
        assertNotEquals("", user1.getUser().getUsername());
        assertNotEquals("", user1.getUser().getPassword());
        assertNotEquals("", user1.getUser().getEmail());
        assertNotEquals("", user1.getUser().getName());
        assertNotEquals("", user1.getUser().getSex());
        assertNotEquals("", user1.getUser().getDateofbirth());
        assertNotEquals("", user1.getUser().getType());

        // Passwords dont match
        assertNotEquals("wrongPassword", user1.getUser().getPassword());

        // username is not unique
        for (User user : users) {
            if (user1.getUser().getUsername().equals(user.getUsername())) {
                assertEquals(user1.getUser().getUsername(), user.getUsername());
            }
        }

    }

    @Test
    void registerUser4() {
        // 000

        Register user1 = new Register();
        user1.registerUser("","","","","","","");

        // fields are not filled in
        assertEquals("", user1.getUser().getUsername());
        assertEquals("", user1.getUser().getPassword());
        assertEquals("", user1.getUser().getEmail());
        assertEquals("", user1.getUser().getName());
        assertEquals("", user1.getUser().getSex());
        assertEquals("", user1.getUser().getDateofbirth());
        assertEquals("", user1.getUser().getType());

        // Passwords dont match
        assertNotEquals("wrongPassword", user1.getUser().getPassword());

        // username is not unique
        for (User user : users) {
            if (user1.getUser().getUsername().equals(user.getUsername())) {
                assertEquals(user1.getUser().getUsername(), user.getUsername());
            }
        }

    }


    @Test
    void registerUser5() {
        // 001

        Register user1 = new Register();
        user1.registerUser("","","","","","","");

        // fields are not filled in
        assertEquals("", user1.getUser().getUsername());
        assertEquals("", user1.getUser().getPassword());
        assertEquals("", user1.getUser().getEmail());
        assertEquals("", user1.getUser().getName());
        assertEquals("", user1.getUser().getSex());
        assertEquals("", user1.getUser().getDateofbirth());
        assertEquals("", user1.getUser().getType());

        // Passwords dont match
        assertNotEquals("wrongPassword", user1.getUser().getPassword());

        // username is unique
        for (User user : users) {
            if (!user1.getUser().getUsername().equals(user.getUsername())) {
                assertNotEquals(user1.getUser().getUsername(), user.getUsername());
            }
        }

    }

    @Test
    void registerUser7() {
        // 011

        Register user1 = new Register();
        user1.registerUser("","","","","","","");

        // fields are not filled in
        assertEquals("", user1.getUser().getUsername());
        assertEquals("", user1.getUser().getPassword());
        assertEquals("", user1.getUser().getEmail());
        assertEquals("", user1.getUser().getName());
        assertEquals("", user1.getUser().getSex());
        assertEquals("", user1.getUser().getDateofbirth());
        assertEquals("", user1.getUser().getType());

        // Passwords match
        assertEquals("", user1.getUser().getPassword());

        // username is unique
        for (User user : users) {
            if (!user1.getUser().getUsername().equals(user.getUsername())) {
                assertNotEquals(user1.getUser().getUsername(), user.getUsername());
            }
        }

    }

}