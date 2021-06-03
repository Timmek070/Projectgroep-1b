package controller;

import Account.User;
import Database.Database;
import Login.login;
import Receipt.Receipt;
import Webshop.Category;
import Webshop.Product;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import org.w3c.dom.Text;

import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.ArrayList;

public class ShoppingCartController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    TextField receiptTextField;
    @FXML
    TextArea bruh;
    public void initialize(){
        System.out.println("Gamign");
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<String> beroepen = new ArrayList<>();
        beroepen.add("aa");
        beroepen.add("bb");
        beroepen.add("cc");
        User ingelogdeUser = new User("gert","gertje","gertje@gmail.com","gert","m","25-09-2001","admin",beroepen);
        products.add(new Product("product1",2.10,new Category("gaming")));
        products.add(new Product("product2",2.10,new Category("gaming")));
        Receipt receipt = new Receipt(ingelogdeUser,products);
        System.out.println(receipt.getReceipt());
//        receiptTextField.setText(receipt.getReceipt());
        bruh.setText(receipt.getReceipt());
    }
    public void backToShop(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ShopScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }
    public void printReceipt(MouseEvent mouseEvent) throws IOException{
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<String> beroepen = new ArrayList<>();
        beroepen.add("aa");
        beroepen.add("bb");
        beroepen.add("cc");
        User ingelogdeUser = new User("gert","gertje","gertje@gmail.com","gert","m","25-09-2001","admin",beroepen);
        products.add(new Product("product1",2.10,new Category("gaming")));
        products.add(new Product("product2",2.10,new Category("gaming")));
        Receipt receipt = new Receipt(ingelogdeUser,products);
        System.out.println(receipt.getReceipt());
    }
}
