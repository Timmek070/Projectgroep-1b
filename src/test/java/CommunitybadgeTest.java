import Account.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommunitybadgeTest {

    User u1 = new User("Admin1", "#1Geheim", "1@gmail.com","Jordy", "M", "3-4-2001", "Admin");



    @Test
    void InitBadgeTestGold() {
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        assertEquals("Gold", u1.getBadge().getRank());
    }

    @Test
    void InitBadgeTestSilver() {
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        assertEquals("Silver", u1.getBadge().getRank());
    }

    @Test
    void InitBadgeTestBronze() {
        u1.addProfession("gamer");
        u1.addProfession("gamer");
        assertEquals("Bronze", u1.getBadge().getRank());
    }
}