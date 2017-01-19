package gross.ryan;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by ryangross on 1/18/17.
 */
public class Inventory {
    private ArrayList<Product> anInventory = new ArrayList<Product>();

    public ArrayList<Product> getInventory() {
        return anInventory;
    }

    public void addProduct(Product newProduct) {
        this.getInventory().add(newProduct);
    }

    public double totalInventoryValue() {
        double total = 0.0;
        for(int i = 0; i < this.getInventory().size(); i++) {
            total += this.getInventory().get(i).totalValue();
        }
        return total;
    }

// Checks quantity on hand. If zero, still shows it so you can replenish.
    public String checkItem(int anID) {
        String answer = "Item not found";
        for(int i = 0; i < this.getInventory().size(); i++) {
            if (this.getInventory().get(i).getID() == anID) {
                answer = "Item #" + this.getInventory().get(i).getID() + ": " + this.getInventory().get(i).getQOH() +
                        " units on hand.";
            }
        }
        return answer;
    }

}
