package Webshop;

import javafx.scene.control.Button;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Category testCategory = new Category("woodworking");
    Button testButton = new Button("Voeg toe");
    Product testProduct = new Product("plank", 3.0 , testCategory, testButton);

    @Test
    public void InitProductTest() {
        assertEquals("plank", testProduct.getName());
        assertEquals(3.0, testProduct.getPrice());
        assertEquals("woodworking", testProduct.getCategory().getName());
    }

}