package mccann.kevin.classmanager;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Product {
    double price;
    String id;
    int quantity;

    public Product(double price, String id, int quantity) {
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

}
