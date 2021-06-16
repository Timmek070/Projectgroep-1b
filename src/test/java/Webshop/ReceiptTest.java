package Webshop;

import Webshop.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TableView;


import Account.Communitybadge;
import Account.User;
import Login.Login;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReceiptTest {
    ArrayList<Product> products = new ArrayList<>();
    @Test
    void getReceiptTest() {

        Login.getInstance().startLogin("Admin","Admin");
        Receipt receipt = new Receipt(products);
        System.out.println(Login.getInstance().getIngelogdeUser().getName());

        assertEquals("Naam koper: \n" +
                "Admin\n" +
                "\n" +
                "Producten: \n" +
                "\n" +
                "\n" +
                "Korting percentage: 10.0% \n" +
                "Korting: €0.0\n" +
                "\n" +
                "Prijs excl. korting: €0.0\n" +
                "Prijs incl. korting: €0.0\n", receipt.getReceipt());
    }

    @Test
    void totaalPrijsInclKortingTest () { // test equivalentieklassen
        Login.getInstance().startLogin("Admin", "Admin");
        Product testProduct = new Product("testProduct", 10.0, "testCat");
        products.add(testProduct);
        Receipt testReceipt = new Receipt(products);

        assertEquals(10.0, testReceipt.getTotaalKorting());
        Login.getInstance().getIngelogdeUser().addProfession("profession2");
        assertEquals(9.5, testReceipt.getTotaalKorting());
        Login.getInstance().getIngelogdeUser().addProfession("profession3");
        assertEquals(9.5, testReceipt.getTotaalKorting());
        Login.getInstance().getIngelogdeUser().addProfession("profession4");
        assertEquals(9.0, testReceipt.getTotaalKorting());
        Login.getInstance().getIngelogdeUser().addProfession("profession5");
        assertEquals(9.0, testReceipt.getTotaalKorting());
        Login.getInstance().getIngelogdeUser().addProfession("profession6");
        assertEquals(8.5, testReceipt.getTotaalKorting());
    }
}