package Account;

import Login.Login;
import Login.Register;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void AddRemoveProfessionUpdateBadge() {
        Login.getInstance().startLogin("Admin", "Admin");

        Login.getInstance().getIngelogdeUser().addProfession("Smith");
        assertEquals("Bronze", Login.getInstance().getIngelogdeUser().getBadge().getRank());

        Login.getInstance().getIngelogdeUser().removeProfessionByName("Smith");
        assertEquals(1, Login.getInstance().getIngelogdeUser().getProfession().size());
        assertEquals("No badge yet", Login.getInstance().getIngelogdeUser().getBadge().getRank());

    }

    @Test
    void checkVillagerProfession () {
        new Register().registerUser("jantje98","johan","jan@live.nl","Jan","<M>","23081998","ADMIN");

        Login.getInstance().startLogin("jantje98", "johan");
        assertEquals("Villager", Login.getInstance().getIngelogdeUser().getProfession().get(0));
    }

    @Test
    void removeVillagerProfession () {
        Login.getInstance().startLogin("Admin", "Admin");
        Login.getInstance().getIngelogdeUser().removeProfessionByName("Villager");
        assertEquals(1, Login.getInstance().getIngelogdeUser().getProfession().size());
    }



}