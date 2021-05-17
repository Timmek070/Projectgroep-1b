import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CommunitybadgeTest {

    ArrayList<String> pl1 = new ArrayList<String>();
    User u1 = new User("Admin1", "#1Geheim", "1@gmail.com","Jordy", "M", "3-4-2001", "Admin", pl1);
    Child c1 = new Child("Toon" , "F", "1-1-2000");
    Communitybadge c = new Communitybadge(u1);


    @Test
    void InitBadgeTestGold() {
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        assertEquals("Gold", u1.getRank());
    }

    @Test
    void InitBadgeTestSilver() {
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        assertEquals("Silver", u1.getRank());
    }

    @Test
    void InitBadgeTestBronze() {
        pl1.add("Software Engineer");
        pl1.add("Software Engineer");
        assertEquals("Bronze", u1.getRank());
    }
}