package controller;

import Account.User;
import Webshop.Category;
import Webshop.Product;
import Webshop.Receipt;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

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
        User ingelogdeUser = new User("gert","gertje","gertje@gmail.com","gert","m","25-09-2001","admin");
        products.add(new Product("product1",2.10,new Category("gaming")));
        products.add(new Product("product2",2.10,new Category("gaming")));
        System.out.println("gaming2");
        Receipt receipt = new Receipt(ingelogdeUser,products);
        System.out.println("gaming3");
        System.out.println(receipt.getReceipt());

        System.out.println("gaming4");

        bruh.setText(receipt.getReceipt());
        System.out.println("gaming5");

    }
    public void backToShop(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ShopScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}