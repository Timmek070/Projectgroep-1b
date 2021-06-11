package controller;

import Account.User;
import Webshop.Product;
import Webshop.Receipt;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
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
        User ingelogdeUser = new User("gert","gertje","gertje@gmail.com","gert","m","25-09-2001","admin");

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("product1",2.10,"gaming", new Button("voeg toe")));
        products.add(new Product("product2",Math.round(2.10 * 100.0) / 100.0,"gaming", new Button("voeg toe")));

        Receipt receipt = new Receipt(ingelogdeUser,products);
        bruh.setText(receipt.getReceipt());
    }
    public void backToShop(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ShopScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}