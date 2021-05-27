public class Product {

    private String name;
    private String category;
    private String description;

    public Product(String name, String category){
        this.name = name;
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getCategory() {
        return category;
    }
}
