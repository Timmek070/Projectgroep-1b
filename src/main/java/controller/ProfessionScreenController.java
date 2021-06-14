package controller;

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

public class ProfessionScreenController implements Initializable {
    @FXML
    private AnchorPane rootPane;
    @FXML
    Text currentProfessionsText;
    @FXML
    TextField addRemoveProfessionTextField;


    public void backToDetails(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/AccountDetailsScreen.fxml"));
        this.rootPane.getChildren().setAll(pane);
    }

    public void refresh() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/ProfessionScreen.fxml"));
        this.rootPane.getChildren().setAll(pane);
    }

    public void fillProfessions () {
        StringBuilder professions = new StringBuilder();
        for (String s : Login.getInstance().getIngelogdeUser().getProfession()) {
            professions.append(s);
            professions.append(", ");

        }
        professions.delete(professions.length()-2, professions.length());

        currentProfessionsText.setText(String.valueOf(professions));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fillProfessions();
    }

    public void addProfession(MouseEvent mouseEvent) throws IOException {
        String profession = addRemoveProfessionTextField.getText();
        Login.getInstance().getIngelogdeUser().addProfession(profession);
        refresh();
    }

    public void removeProfession(MouseEvent mouseEvent) throws IOException {
        String profession = addRemoveProfessionTextField.getText();
        Login.getInstance().getIngelogdeUser().removeProfessionByName(profession);
        refresh();
    }
}
