package Login;

import Account.User;

public class Register {

    private User user;

    public void registerUser(String username, String password, String email,String name, String sex, String birthdate, String role){
        this.user = new User(username, password, email, name, sex, birthdate, role);
        Login.getInstance().addUserDatabase(user);
    }

    public User getUser() {
        return user;
    }
}
