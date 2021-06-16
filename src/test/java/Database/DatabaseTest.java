package Database;

import Account.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void getUsers() {
        ArrayList<User> Users;
        Users = Database.getInstance().getUsers();
        String username;
        for (int i = 0; i < Users.size(); i++) {
            if (Users.get(i).getUsername() == "Admin") ;
            username = Users.get(i).getUsername();
            assertEquals(username, "Admin");
            break;
        }
    }
    @Test
    void addUser(){
        ArrayList<String> profession = new ArrayList<>();
        profession.add("woodworking");
        User user = new User("GivanStaub", "#1Geheim", "GivanStaub@gmail.com","Givan", "M", "23041998", "User");
    }
}