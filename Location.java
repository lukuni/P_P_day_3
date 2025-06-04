// Location.java
import java.util.ArrayList;
import java.util.List;

public class Location {
    String name;
    List<Product> products;

    public Location(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void printProducts() {
        System.out.println("Products at " + name + ":");
        for (Product p : products) {
            System.out.println(" - " + p);
        }
    }
}
