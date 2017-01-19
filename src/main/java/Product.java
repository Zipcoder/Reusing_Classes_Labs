/**
 * Created by prestonbattin on 1/18/17.
 */
public class Product {
   protected Inventory tracker;
    protected double price;
    protected int id, quantity;

    Product(int id, int quantity, double price){

        this.price = price;
        this.id = id;
        this.quantity = quantity;

         tracker = new Inventory(quantity, price){};
    }


    public int getId(){

        return this.id;
    }

    public double getPrice(){

        return tracker.getPrice();
    }

    public int getQuantity(){

        return tracker.quantity;
    }

    public double getTotalCost(){

        return tracker.getTotalPrice();
    }


}
