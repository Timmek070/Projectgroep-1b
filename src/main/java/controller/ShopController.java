package controller;

import Database.Database;
import Webshop.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ShopController implements Initializable {
    private ObservableList<Product> products = FXCollections.observableArrayList();
    private ArrayList<Product> productsDB = Database.getInstance().getProducts();
    private ArrayList<String> productsCategory = new ArrayList<>();
    private ObservableList<Product> shoppingcart = FXCollections.observableArrayList();

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

    @FXML
    private MenuItem woodworking;

    @FXML
    private MenuItem powertools;

    private String productCategory;

    Button addButton = new Button("Add");

    ObservableList<Product> list = FXCollections.observableArrayList(products);

    private void buttonOnclick(ActionEvent event) {
        shoppingcart.add(products.get(0));
        System.out.println(shoppingcart);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addButton.setOnAction(this::buttonOnclick);
        name.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        price.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
        category.setCellValueFactory(new PropertyValueFactory<Product, String>("category"));
        button.setCellValueFactory(new PropertyValueFactory<Product, Button>("button"));

        for(Product product : productsDB){
            products.add(product);
        }

        for (Product product : productsDB){
            productsCategory.add(product.getCategory());
        }

        table.setItems(list);

        woodworking.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                woodworkList.clear();
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
                powertoolList.clear();
                for (Product product : products){
                    if(product.getCategory().equals("powertool")){
                        powertoolList.add(product);
                    }
                }
                table.setItems(powertoolList);
            }
        });
    }

    public Stage showShop(ObservableList<Product> shoppingcart) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ShoppingCartScreen.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        ShoppingCartController controller = loader.getController();
        controller.initData(shoppingcart);
        stage.show();
        return stage;
    }

    public void backToHome(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void toShop(MouseEvent mouseEvent) throws IOException {
        showShop(shoppingcart);
    }

    ObservableList<String> categorylist = FXCollections.observableArrayList(productsCategory);


    ObservableList<Product> woodworkList = FXCollections.observableArrayList();
    ObservableList<Product> powertoolList = FXCollections.observableArrayList();
}
