package controller;

import Account.User;
import Webshop.Product;
import Webshop.Receipt;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ShoppingCartController implements Initializable {
    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button closeButton;

    @FXML
    private TableView<Product> table;

    @FXML
    private TableColumn<Product, String> name;

    @FXML
    private TableColumn<Product, Double> price;

    @FXML
    private TableColumn<Product, String> category;

    @FXML
    private TableColumn<Product, Button> button;

    void initData(ObservableList<Product> shoppingcart){
        name.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        price.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
        category.setCellValueFactory(new PropertyValueFactory<Product, String>("category"));
        button.setCellValueFactory(new PropertyValueFactory<Product, Button>("button"));
        table.setItems(shoppingcart);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { }

    @FXML
    void closeShop(MouseEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void printReceipt(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/Receipt.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}