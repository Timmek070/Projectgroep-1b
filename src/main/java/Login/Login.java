package Login;

import Account.User;
import Database.Database;
import java.util.ArrayList;




public class Login {

    private static Login singleton = null;
    private ArrayList<User> accounts;
    private Boolean isLoggedIn = false;
    private Database database;
    private User ingelogdeUser;


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

        System.out.println(username);
        System.out.println(password);


        this.accounts = database.getUsers();

        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getUsername().equals(username) && this.accounts.get(i).getPassword().equals(password)){
                this.isLoggedIn = true;
                this.ingelogdeUser = this.accounts.get(i);
            }
        }

    }
    public Database getDatabase(){
        return this.database;
    }

    public Boolean getLoggedIn() {
        return isLoggedIn;
    }

    public void addUserDatabase(User user){
        database.addUser(user);
    }
}
