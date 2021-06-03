package Login;

import Account.User;
import Database.Database;
import java.util.ArrayList;




public class Login {

    private static Login singleton = null;
    private ArrayList<User> accounts;
    private Boolean isLoggedIn = false;
    private Database database;


    private Login() {
        this.database = new Database();
     this.accounts = new ArrayList<>();
    }

    public static Login getInstance() {
        if (singleton == null) {
            singleton = new Login();
        }
        return singleton;
    }

    public void startLogin(String username, String password) {

        this.accounts = database.getUsers();

        for (int i = 0; i > this.accounts.size(); i++) {
            if (this.accounts.get(i).getUsername() == username && this.accounts.get(i).getPassword() == password){
                this.isLoggedIn = true;
            }
        }
    }
    public Database getDatabase(){
        return this.database;
    }

    public Boolean getLoggedIn() {
        return isLoggedIn;
    }
}
