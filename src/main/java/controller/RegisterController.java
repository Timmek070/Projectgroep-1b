package controller;

import Login.Register;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import javafx.scene.control.TextField;
import java.io.IOException;

public class RegisterController{
    @FXML
    private AnchorPane rootPane;
    @FXML
    TextField emailField;
    @FXML
    TextField usernameField;
    @FXML
    PasswordField passwordField;
    @FXML
    PasswordField confPasswordField;
    @FXML
    TextField nameField;
    @FXML
    TextField sexField;
    @FXML
    TextField birthdateField;
    @FXML
    TextField roleField;
    @FXML
    Text foutmeldingText;

    public void backToWelcome(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/WelcomeScreen.fxml"));
        this.rootPane.getChildren().setAll(pane);
    }

    public void CreateUser(MouseEvent mouseEvent) throws IOException{
        if(passwordField.getCharacters().toString().equals(confPasswordField.getCharacters().toString())){
            Register register = new Register();
            register.registerUser(
                    usernameField.getText(),
                    passwordField.getText(),
                    emailField.getText(),
                    nameField.getText(),
                    sexField.getText(),
                    birthdateField.getText(),
                    roleField.getText());

            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/LoginScreen.fxml"));
            this.rootPane.getChildren().setAll(pane);
        } else {
            foutmeldingText.setText("Passwords don't match!");
        }
    }
}
