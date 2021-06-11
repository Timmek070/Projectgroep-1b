package controller;

import Webshop.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TableView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShopController implements Initializable {

    @FXML
    private AnchorPane rootPane;

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

    private Product kaas = new Product("Kaas", 2.00, "Woodworking", new Button("Add"));
    private Product barend = new Product("Barend", 10.00, "Barend", new Button("Add"));

    public void backToHome(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void toShop(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ShoppingCartScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    ObservableList<String> categorylist = FXCollections.observableArrayList(
            kaas.getCategory(),
            barend.getCategory()
    );

    ObservableList<Product> list = FXCollections.observableArrayList(kaas, barend);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        price.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
        category.setCellValueFactory(new PropertyValueFactory<Product, String>("category"));
        button.setCellValueFactory(new PropertyValueFactory<Product, Button>("button"));

        table.setItems(list);
    }
}
