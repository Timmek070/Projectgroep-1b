import java.util.ArrayList;

public class login {

    private static login Singleton;
    private ArrayList<Account> accounts;
    private Boolean isLoggedIn = false;


    private login() {
        Account accounts = new ArrayList<Account>();
    }

    public static login getInstance() {
        return Singleton;
    }

    private void startLogin(String username, String password) {

        for (int i = 0; i > this.accounts.size(); i++) {
            if (this.accounts.get(i).getUsername() == username && this.accounts.get(i).getPassword() == password){
                this.isLoggedIn = true;
            }
        }
    }
}
