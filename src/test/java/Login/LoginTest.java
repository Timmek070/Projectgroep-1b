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
    void getDatabase() {
        Database database = Login.getInstance().getDatabase();
        assertEquals(database, Login.getInstance().getDatabase());
    }

    @Test
    void getLoggedIn() {
        Login.getInstance().setLogout();
        assertFalse(Login.getInstance().getLoggedIn());
    }

    @Test
    void getIngelogdeUser() {
        Login.getInstance().startLogin("Admin","Admin");
        ArrayList<User> users = Login.getInstance().getDatabase().getUsers();
        for(User user : users){
            if(user.getUsername().equals("Admin")){
                assertEquals(user, Login.getInstance().getIngelogdeUser());
            }
        }
    }

    @Test
    void addUserDatabase() {
        User ken = new User("Ken", "Ken", "Admin@Admin.com", "Admin", "M","01011111", "User");
        Login.getInstance().addUserDatabase(ken);
        assertEquals(Login.getInstance().getDatabase(),Login.getInstance().getDatabase());
    }

    @Test
    void setLogout() {
        Login.getInstance().setLogout();
        assertFalse(Login.getInstance().getLoggedIn());
        assertEquals(null, Login.getInstance().getIngelogdeUser());
    }
}