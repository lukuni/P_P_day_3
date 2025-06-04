public class Main {
    public static void main(String[] args) {

        String furniture = "Furniture";
        Product item1 = new Product("Shiree", 150000.0, 10, furniture);
        Product item2 = new Product("Sandal", 30000.0, 20, furniture);

        Location loc1 = new Location("Aguulah A");
        Location loc2 = new Location("Aguulah B");

        loc1.addProduct(item1);
        loc1.addProduct(item2);

        Warehouse warehouse = new Warehouse("Undsen aguulah");
        warehouse.addLocation(loc1);
        warehouse.addLocation(loc2);

        warehouse.showAllProducts();

        System.out.println("\n--- Shiljuulj baina ---");

        warehouse.showAllProducts();
    }
}