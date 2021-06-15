package Login;

import Account.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MCCtest {

    @Test
    void MCCtest1() {

        Register user1 = new Register();
        user1.registerUser("u1", "#1Geheim", "u1@gmail.com", "u1", "M", "24-12-2000", "Admin");

        user1.getUser();


    }


}