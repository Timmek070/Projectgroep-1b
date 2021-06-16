import Account.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    ArrayList<String> pl1 = new ArrayList<String>();
    User u1 = new User("Admin1", "#1Geheim", "1@gmail.com","Jordy", "M", "3-4-2001", "Admin");


    @Test
    void InitUserTest() {
        assertEquals("Admin1", u1.getUsername());
        assertEquals("#1Geheim", u1.getPassword());
        assertEquals("1@gmail.com", u1.getEmail());
        assertEquals("Jordy", u1.getName());
        assertEquals("M", u1.getSex());
        assertEquals("3-4-2001", u1.getDateofbirth());
        assertEquals("Admin", u1.getType());
        pl1.add("Software Engineer");
        assertEquals("Software Engineer", u1.getProfession().get(0));
    }

}