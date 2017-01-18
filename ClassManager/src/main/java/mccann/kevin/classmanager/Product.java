package mccann.kevin.classmanager;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Product {
    private double price;
    private String id;
    private int quantity;

    Product(double price, String id, int quantity) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    double getPrice() {
        return price;
    }

    String getId() {
        return id;
    }

    int getQuantity() {
        return quantity;
    }

}
