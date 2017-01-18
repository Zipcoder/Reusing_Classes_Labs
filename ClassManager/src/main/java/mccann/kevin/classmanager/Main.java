package mccann.kevin.classmanager;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Main {

    public static void main(String args[]) {
        Inventory manager = new Inventory();
        Product ham = new Product(2.20, "ham", 4);
        Product cheese = new Product(5.65, "cheese", 34);
        Product bread = new Product(1.20, "bread", 66);
        manager.addItemToInventory(ham);
        manager.addItemToInventory(cheese);
        manager.addItemToInventory(bread);

        System.out.println(manager.valueOfSingleItem(ham));
        System.out.println(manager.sumOfInventoryValue());
        System.out.println(manager.getProducts());
    }
}
