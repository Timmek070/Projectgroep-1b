package controller;

import Account.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;

public class RegisterController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    TextField emailField;
    @FXML
    TextField usernameField;
    @FXML
    TextField passwordField;
    @FXML
    TextField confPasswordField;
    @FXML
    TextField nameField;
    @FXML
    TextField sexField;
    @FXML
    TextField birthdateField;
    @FXML
    TextField roleField;

    public void backToWelcome(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/WelcomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void CreateUser(){
        User user = new User(
                usernameField.getText(),
                passwordField.getText(),
                emailField.getText(),
                nameField.getText(),
                sexField.getText(),
                birthdateField.getText(),
                roleField.getText()
        );

        
    }
}
