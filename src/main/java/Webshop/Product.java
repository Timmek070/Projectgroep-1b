package Webshop;

import javafx.scene.control.Button;

public class Product {

    private String name;
    private Double price;
    private Category category;
    private Button button;

    public Product(String name, Double price, Category category, Button button){
        this.name = name;
        this.price = price;
        this.category = category;
        this.button = button;
    }

    public String getName(){
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public Button getButton() { 
        return button; 
    }
}
