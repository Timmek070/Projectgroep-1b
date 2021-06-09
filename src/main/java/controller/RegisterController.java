package controller;

import Account.User;
import Database.Database;
import Login.Login;
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
                usernameField.getCharacters().toString(),
                passwordField.getCharacters().toString(),
                emailField.getCharacters().toString(),
                nameField.getCharacters().toString(),
                sexField.getCharacters().toString(),
                birthdateField.getCharacters().toString(),
                roleField.getCharacters().toString()
        );

        System.out.println(user);
        System.out.println(usernameField.getCharacters().toString());

        Login.getInstance().addUserDatabase(user);

        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginScreen.fxml"));
        this.rootPane.getChildren().setAll(pane);
    }
}
