package Webshop;

import javafx.scene.control.Button;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    String testCategory = "woodworking";
    Product testProduct = new Product("plank", 3.0 , testCategory, new Button());

    @Test
    public void InitProductTest() {
        assertEquals("plank", testProduct.getName());
        assertEquals(3.0, testProduct.getPrice());
        assertEquals("woodworking", testProduct.getCategory());
    }

}