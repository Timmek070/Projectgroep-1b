package controller;

import Account.User;
import Login.Login;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AccountDetailsController implements Initializable {
    @FXML
    private AnchorPane rootPane;
    @FXML
    TextField emailField;
    @FXML
    TextField usernameField;
    @FXML
    TextField nameField;
    @FXML
    TextField sexField;
    @FXML
    TextField birthdateField;
    @FXML
    TextField roleField;
    @FXML
    Text emailText;
    @FXML
    Text usernameText;
    @FXML
    Text nameText;
    @FXML
    Text sexText;
    @FXML
    Text birthDateText;
    @FXML
    Text roleText;
    @FXML
    Text badgeText;
    @FXML
    Text numberOfProfessionsText;


    public void backToHome(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        this.rootPane.getChildren().setAll(pane);
    }

    public void toProfessions(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ProfessionScreen.fxml"));
        this.rootPane.getChildren().setAll(pane);
    }

    public void getDetails () {



        emailText.setText(Login.getInstance().getIngelogdeUser().getEmail());
        usernameText.setText(Login.getInstance().getIngelogdeUser().getUsername());
        nameText.setText(Login.getInstance().getIngelogdeUser().getName());
        sexText.setText(Login.getInstance().getIngelogdeUser().getSex());
        birthDateText.setText(Login.getInstance().getIngelogdeUser().getDateofbirth());
        roleText.setText(Login.getInstance().getIngelogdeUser().getType());
        badgeText.setText(Login.getInstance().getIngelogdeUser().getBadge().getRank());
        numberOfProfessionsText.setText("" + Login.getInstance().getIngelogdeUser().getProfession().size());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getDetails();
    }
}
