package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.lang.model.element.NestingKind;
import java.io.IOException;

public class ShopController {

    @FXML
    private AnchorPane rootPane;

    public static void main(String args[]){
        start();
    }

    public void backToHome(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void toShop(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ShoppingCartScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void start() {
        //Creating a Text object
        Text text = new Text();
        //Setting the text to be added.
        text.setText("Hello how are you");

        //setting the position of the text
        text.setX(250);
        text.setY(250);
        rootPane.getChildren().
    }
}
