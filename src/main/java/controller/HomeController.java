package controller;

import Login.Login;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomeController {

    @FXML
    private AnchorPane rootPane;

    public void logout(MouseEvent mouseEvent) throws IOException {
        Login.getInstance().setLogout();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }
    public void shop(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ShopScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void details (MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/AccountDetailsScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}
