package Database;

import Account.User;
import Webshop.Category;
import Webshop.Product;

import java.util.ArrayList;

public class Database {
    private ArrayList<User> users = new ArrayList<>();
    private User toon = new User("antonio", "hallo1", "toontje@toon.com", "Toon Langendam", "M", "23051998", "User");
    private User jan = new User("jantje","hallo1", "jantje@jan.com", "Jan Glazenborg","M","23081998", "User");

    public Database() {
        ArrayList<String> professions = new ArrayList<>();
        professions.add("woodworking");
        professions.add("painting");
        Category memer = new Category("woodworking");


//        Product plank = new Product("Plank", "woodworking", 10.0);
//        Product screw = new Product("Screw", "woodworking", 0.5);
//        Product screwdriver = new Product("Screwdriver", "woodworking", 3.0);
//
//        Product pinkPaint = new Product("Pink paint 2L", "painting", 15.0);
//        Product wideBrush = new Product("Wide brush", "painting", 4.0);
//        Product paintRoller = new Product("Paint roller", "painting", 4.0);
        users.add(toon);
        users.add(jan);
    }


    public void addUser(User user){
        users.add(user);
    }
}
