package Database;

import Account.User;
import Login.Login;

import java.util.ArrayList;

public class Database {
    private static Database singleton = null;
    private ArrayList<User> Users;

    private Database() {
        ArrayList<String> professions = new ArrayList<>();
        professions.add("woodworking");
        professions.add("painting");
        String memer = "woodworking";
        this.Users = new ArrayList<>();

//        Product plank = new Product("Plank", "woodworking", 10.0);
//        Product screw = new Product("Screw", "woodworking", 0.5);
//        Product screwdriver = new Product("Screwdriver", "woodworking", 3.0);
//
//        Product pinkPaint = new Product("Pink paint 2L", "painting", 15.0);
//        Product wideBrush = new Product("Wide brush", "painting", 4.0);
//        Product paintRoller = new Product("Paint roller", "painting", 4.0);


        User Admin = new User("Admin", "Admin", "Admin@Admin.com", "Admin", "M","01011111", "User");
        User toon = new User("antonio", "hallo1", "toontje@toon.com", "Toon Langendam", "M", "23051998", "User");
        User jan = new User("jantje","hallo1", "jantje@jan.com", "Jan Glazenborg","M","23081998", "User");


        this.Users.add(Admin);
        this.Users.add(toon);
        this.Users.add(jan);



    }

    public static Database getInstance() {
        if (singleton == null) {
            singleton = new Database();
        }
        return singleton;
    }


    public ArrayList<User> getUsers(){
        return Users;
    }

    public void addUser(User user){
        this.Users.add(user);
    }
}
