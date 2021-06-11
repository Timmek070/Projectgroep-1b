package Buttons;

import Database.Database;
import Webshop.Product;

import javafx.scene.control.Button;
import java.util.ArrayList;

public class AddToCartButton extends Button {

    private ArrayList<Product> products = new ArrayList<Product>();

    public AddToCartButton(String name, String productnaam)
    {
        super(name);
        products = new Database().getProduct();


    }

    public void addProduct()
    {
        System.out.println("click!");
    }

}
