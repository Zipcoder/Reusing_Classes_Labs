package mccann.kevin.classmanager;

import java.util.ArrayList;
import java.util.zip.Adler32;

/**
 * Created by kevinmccann on 1/18/17.
 */
class Inventory{

    private ArrayList<Product> products = new ArrayList<Product>();
    double sum;

    public String getProducts() {
        String list = "";
        for(Product product: products)
            list += product.toString() + " ";
        return list;
    }

    public void addItemToInventory(Product product) {
        products.add(product);
    }

    double valueOfSingleItem(Product product) {
        return product.getPrice()*product.getQuantity();
    }

    double sumOfInventoryValue() {
        for (Product product: products) {
            sum += valueOfSingleItem(product);
        }
        return sum;
    }
}
