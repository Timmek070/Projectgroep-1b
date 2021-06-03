import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class loginTest {

    @Test
    public void checkLogin()
    {

        ArrayList<String> pl1 = new ArrayList<String>();
        User u1 = new User("Admin1", "#1Geheim", "1@gmail.com","Jordy", "M", "3-4-2001", "Admin", pl1);
        login l1 = login.getInstance();

        login.startLogin("Admin1", "#1Geheim");

        assertEquals(true, login.getInstance());
        assertEquals(true, login.getIsLoggedIn());


    }

}