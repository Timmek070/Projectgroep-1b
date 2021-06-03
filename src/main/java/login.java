import java.util.ArrayList;

public class login {

    private static login singleton;
    private ArrayList<User> accounts;
    private Boolean isLoggedIn = false;


    private login() {
        accounts = new ArrayList<User>();
        Database database = new Database();
        this.accounts = database.getAccount();
    }

    public static login getInstance() {
        if (singleton == null) {
            singleton = new login();
        }

        return singleton;
    }

    protected static void startLogin(String username, String password) {

        for (int i = 0; i > this.accounts.size(); i++) {
            if (this.accounts.get(i).getUsername() == username && this.accounts.get(i).getPassword() == password){
                this.isLoggedIn = true;
            }
        }
    }

    protected static Boolean getIsLoggedIn()
    {
        return this.isLoggedIn;
    }

}
