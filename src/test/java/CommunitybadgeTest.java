import Account.Child;
import Account.Communitybadge;
import Account.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommunitybadgeTest {

    ArrayList<String> pl1 = new ArrayList<String>();
    User u1 = new User("Admin1", "#1Geheim", "1@gmail.com","Jordy", "M", "3-4-2001", "Admin", pl1);
    Child c1 = new Child("Toon" , "F", "1-1-2000");



    @Test
    void InitBadgeTestGold() {
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        u1.updateBadge();
        assertEquals("Gold", u1.getBadge().getRank());
    }

    @Test
    void InitBadgeTestSilver() {
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        u1.updateBadge();
        assertEquals("Silver", u1.getBadge().getRank());
    }

    @Test
    void InitBadgeTestBronze() {
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        u1.updateBadge();
        assertEquals("Bronze", u1.getBadge().getRank());
    }
}