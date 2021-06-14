package Webshop;

import Account.Child;
import Account.Communitybadge;
import Account.User;
import Login.Login;
import javafx.scene.control.Button;
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
}