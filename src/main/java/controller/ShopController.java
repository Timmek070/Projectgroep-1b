package controller;

import Webshop.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
    private MenuItem woodworking;

    @FXML
    private MenuItem powertools;

    @FXML
    private TableColumn<Product, Button> button;

    private String productCategory;

    private ArrayList<Product> products = new ArrayList<>();

    private Product wood = new Product("wood", 2.00, "woodworking", new Button("voeg toe"));
    private Product nail = new Product("nail", 10.00, "powertool", new Button("voeg toe"));

    public void backToHome(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void toShop(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ShoppingCartScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    ObservableList<String> categorylist = FXCollections.observableArrayList(
            wood.getCategory(), nail.getCategory()
    );

    ObservableList<Product> list = FXCollections.observableArrayList(
           wood,nail
    );

    ObservableList<Product> woodworkList = FXCollections.observableArrayList();
    ObservableList<Product> powertoolList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        price.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
        category.setCellValueFactory(new PropertyValueFactory<Product, String>("category"));
        button.setCellValueFactory(new PropertyValueFactory<Product, Button>("button"));

        products.add(nail);
        products.add(wood);

        table.setItems(list);

        woodworking.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                for (Product product : products){
                    if(product.getCategory().equals("woodworking")){
                        woodworkList.add(product);
                    }
                }
                table.setItems(woodworkList);
            }
        });

        powertools.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                for (Product product : products){
                    if(product.getCategory().equals("powertool")){
                        powertoolList.add(product);
                    }
                }
                table.setItems(powertoolList);
            }
        });
    }
}
