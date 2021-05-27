import java.util.ArrayList;

class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        for(int i = 0; i < products.size(); i++){
            products.get(i).setCategory(this.name);
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}