package armstrong.alexandra;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alexandraarmstrong on 1/18/17.
 */
public class Reusing_Classes_3 {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        Product apple = new Product(0.20, "Apple", 42);
        Product banana = new Product(0.05, "Banana", 184);
        Product pear = new Product(0.40, "Pear", 28);

        inventory.addInventory(apple.getId(), apple);
        inventory.addInventory(banana.getId(), banana);
        inventory.addInventory(pear.getId(), pear);

        System.out.println(inventory.oneItemTotalValue("Pear"));

        apple.setQuantity(18);

        System.out.println(apple.getQuantity());


    }
}

class Product{
    double price;
    String id;
    int quantity;

    Product(double price, String id, int quantity){
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory{

    HashMap<String, Product> inventory = new HashMap<String, Product>();

    public HashMap<String, Product> getInventory() {
        return inventory;
    }

    public void addInventory(String name, Product item) {
        inventory.put(name, item);
    }

    public double oneItemTotalValue(String name){
        return inventory.get(name).price * inventory.get(name).quantity;
    }
}
