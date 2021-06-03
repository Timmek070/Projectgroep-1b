package controller;

import Account.User;
import Database.Database;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController{
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
        this.rootPane.getChildren().setAll(pane);
    }

    public void CreateUser(MouseEvent mouseEvent) throws IOException{
        User user = new User(
                usernameField.getText(),
                passwordField.getText(),
                emailField.getText(),
                nameField.getText(),
                sexField.getText(),
                birthdateField.getText(),
                roleField.getText()
        );
        Database database = new Database();
        database.addUser(user);

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginScreen.fxml"));
        this.rootPane.getChildren().setAll(pane);
    }
}
