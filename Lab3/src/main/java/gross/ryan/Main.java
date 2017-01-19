package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class Main {

    public static void main(String[] args) {
        Inventory bestBuyInventory = new Inventory();
        Product xboxOneSlim = new Product(249.99, 5613802, 250);
        Product nintendoSwitch = new Product(299.99, 567003, 20);
        bestBuyInventory.addProduct(xboxOneSlim);
        bestBuyInventory.addProduct(nintendoSwitch);
        System.out.println(bestBuyInventory.totalInventoryValue());
        System.out.println(bestBuyInventory.checkItem(567003));
    }
}
