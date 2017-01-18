package mccann.kevin.classmanager;

/**
 * Created by kevinmccann on 1/18/17.
 */
class Inventory{
    double valueOfSingleItem(Product product) {
        return product.getPrice()*product.getQuantity();
    }
}
