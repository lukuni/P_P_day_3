// Product.java
public class Product {
    String name;
    double price;
    int quantity;
    String category;

    public Product(String name, double price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String toString() {
        return name + " (" + price + " Togrog) - Qty: " + quantity + " [Category: " + category + "]";
    }
}