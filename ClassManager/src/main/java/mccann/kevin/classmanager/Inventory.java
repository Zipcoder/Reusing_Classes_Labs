package mccann.kevin.classmanager;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Inventory{
    public double valueOfSingleItem(Product product) {
        return product.getPrice()*product.getQuantity();
    }
}
