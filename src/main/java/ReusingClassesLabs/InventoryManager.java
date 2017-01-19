package ReusingClassesLabs;

import java.util.ArrayList;

/**
 * Created by randallcrame on 1/18/17.
 */
public class InventoryManager {
    private ArrayList<Product> inventoryList = new ArrayList<>();


public void addToInventory(Product product){
    inventoryList.add(product);
}
public double sumOfInventory(){
    double sum = 0;
    for (Product item : inventoryList)
        sum += item.getPrice() * item.getQuantity();
    return sum;
}
}
