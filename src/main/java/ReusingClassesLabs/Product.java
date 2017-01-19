package ReusingClassesLabs;

/**
 * Created by randallcrame on 1/18/17.
 */
public class Product {
    private double price;
    private final String id;
    private int quantity;

    public Product(String id, double price, int quantity) {
        this.price =  price;
        this.id = id;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getId(){
        return id;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }
}
