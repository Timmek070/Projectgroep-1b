package Login;

import Account.User;

public class Register {
    public void registerUser(String username, String password, String email,String name, String sex, String birthdate, String role){
        User user = new User(username, password, email, name, sex, birthdate, role);
        Login.getInstance().addUserDatabase(user);
    }
}
