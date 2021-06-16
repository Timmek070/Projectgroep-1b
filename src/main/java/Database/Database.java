package Database;

import Account.User;
import Login.Login;
import Webshop.Product;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class Database {
    private static Database singleton = null;
    private ArrayList<User> users;
    private ArrayList<Product> products = new ArrayList<>();
    Button addButton = new Button("Add");
    Button addButton1 = new Button("Add");
    Button addButton2 = new Button("Add");
    Button addButton3 = new Button("Add");
    Button addButton4 = new Button("Add");
    Button addButton5 = new Button("Add");

    private Database() {
        ArrayList<String> professions = new ArrayList<>();
        professions.add("woodworking");
        professions.add("painting");
        this.users = new ArrayList<>();

        Product plank = new Product("Plank" , 10.0,"woodworking",addButton);
        Product screw = new Product("Screw",0.5, "woodworking" ,addButton1);
        Product screwdriver = new Product("Screwdriver", 3.0 , "woodworking", addButton2);

        Product drill = new Product("Drill", 15.0, "powertool", addButton3);
        Product battery = new Product("Battery", 10.0, "powertool", addButton4);
        Product chainsaw = new Product("Chainsaw", 25.0, "powertool", addButton5);


        User Admin = new User("Admin", "Admin", "Admin@Admin.com", "Admin", "M","27/07/2000", "User");
        User toon = new User("antonio", "hallo1", "toontje@toon.com", "Toon Langendam", "M", "23/05/1998", "User");
        User jan = new User("jantje","hallo1", "jantje@jan.com", "Jan Glazenborg","M","23/08/1998", "User");


        this.users.add(Admin);
        this.users.add(toon);
        this.users.add(jan);

        products.add(plank);
        products.add(screw);
        products.add(screwdriver);
        products.add(drill);
        products.add(battery);
        products.add(chainsaw);

    }

    public static Database getInstance() {
        if (singleton == null) {
            singleton = new Database();
        }
        return singleton;
    }


    public ArrayList<User> getUsers(){
        return users;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }

    public void addUser(User user){
        this.users.add(user);
    }
}
