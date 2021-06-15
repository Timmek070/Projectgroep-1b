package Login;

import Account.User;
import Database.Database;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void registerUser() {
        new Register().registerUser("kadmosb1","keesgerard","kadmosb1","Karel","Ja","Nee","ADMIN");
        ArrayList<User> users = Database.getInstance().getUsers();
        for(User user : users){
            if(user.getUsername().equals("kadmosb1")){
                assertTrue(Login.getInstance().userExist("kadmosb1", "keesgerard"));
            }
        }
    }
}