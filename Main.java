
public class Main {
    public static void main(String[] args) {
        Product item1 = new Product("Shiree", 150000.0, 10);
        Product item2 = new Product("Sandal", 30000.0, 20);

        Location loc1 = new Location("Aguulakh A");
        Location loc2 = new Location("Aguulakh B");

        loc1.addProduct(item1);
        loc1.addProduct(item2);

        Warehouse warehouse = new Warehouse("Undsen aguulakh");
        warehouse.addLocation(loc1);
        warehouse.addLocation(loc2);

        warehouse.showAllProducts();

        System.out.println("\n--- Shiljuulj baina ---");

        warehouse.showAllProducts();
    }
}
