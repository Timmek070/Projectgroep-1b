package Login;

import Account.User;
import Database.Database;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    @Test
    void getInstance() {
        assertEquals(Login.getInstance(),Login.getInstance() );
    }

    @Test
    void startLogin() {
        Login.getInstance().startLogin("Admin","Admin");
        assertTrue(Login.getInstance().getLoggedIn());
    }

    @Test
    void getLoggedIn() {
        Login.getInstance().setLogout();
        assertFalse(Login.getInstance().getLoggedIn());
    }

    @Test
    void getIngelogdeUser() {
        Login.getInstance().startLogin("Admin","Admin");
        ArrayList<User> users =  Database.getInstance().getUsers();

        for(User user : users){
            if(user.getUsername().equals("Admin")){
                assertEquals(user, Login.getInstance().getIngelogdeUser());
            }
        }
    }

    @Test
    void addUserDatabase() {
        User ken = new User("Ken", "Ken", "Admin@Admin.com", "Admin", "M","01011111", "User");
        Database.getInstance().addUser(ken);
        ArrayList<User> User =  Database.getInstance().getUsers();
        Boolean testWorks = false;
            for (int i = 0; i < User.size(); i++)
            {
                if(User.get(i).getUsername().equals(ken.getUsername())){
                    testWorks = true;
            }
        }

        assertEquals(true, testWorks);
    }

    @Test
    void setLogout() {
        Login.getInstance().setLogout();
        assertFalse(Login.getInstance().getLoggedIn());
        assertEquals(null, Login.getInstance().getIngelogdeUser());
    }
}