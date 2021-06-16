package controller;

import Login.Login;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

    public Text foutmeldingText;
    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;


    public void back(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/WelcomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }
    public void Login(MouseEvent mouseEvent) throws IOException {
        Login.getInstance().startLogin(usernameField.getCharacters().toString(), passwordField.getCharacters().toString());
        if (Login.getInstance().getLoggedIn() && !usernameField.getCharacters().toString().equals("") && !passwordField.getCharacters().toString().equals("")){
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
        }
          else{
            foutmeldingText.setText("Login Failed!");
        }
    }

    public void home(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Punt om data op te halen.
    }
}
