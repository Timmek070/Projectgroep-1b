package Database;

import Account.User;
import Webshop.Product;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class Database {
    private ArrayList<User> Users;
    private ArrayList<Product> product;

    public Database() {
        ArrayList<String> professions = new ArrayList<>();
        professions.add("woodworking");
        professions.add("painting");
        this.Users = new ArrayList<>();

        Product plank = new Product("Plank", 10.0, "Woodworking", new Button());
        Product screw = new Product("Screw", 0.5,"Woodworking", new Button());
        Product screwdriver = new Product("Screwdriver", 3.0, "Woodworking", new Button());
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

        this.product.add(plank);
        this.product.add(screw);
        this.product.add(screwdriver);

    }

    public ArrayList<Product> getProduct(){
        return product;
    }

    public ArrayList<User> getUsers(){
        return Users;
    }

    public void addUser(User user){
        this.Users.add(user);
    }
}
