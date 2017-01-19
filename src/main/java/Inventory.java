/**
 * Created by prestonbattin on 1/18/17.
 */
public class Inventory {

    int quantity;
    double totalCost, price;


    Inventory(int quantity, double price){

        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice(){

        return quantity * price;
    }

    public int getQuantity(){

        return this.quantity;
    }

    public double getPrice(){

        return this.price;
    }

}
