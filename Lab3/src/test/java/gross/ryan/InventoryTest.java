package gross.ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/18/17.
 */
public class InventoryTest {
    Inventory bestBuyInventory;
    Product xboxOneSlim = new Product(249.99, 5613802, 250);
    Product nintendoSwitch = new Product(299.99, 567003, 20);
    Product notAvailable = new Product(0.0,567001, 0);

    @Before
    public void setUp() {
        bestBuyInventory = new Inventory();
        bestBuyInventory.addProduct(xboxOneSlim);
        bestBuyInventory.addProduct(nintendoSwitch);

    }

    @Test
    public void totalInventoryValueTest() {
        Assert.assertEquals(68497.00, bestBuyInventory.totalInventoryValue(), 1.00);
    }

    @Test
    public void checkItemTest() {
        Assert.assertEquals("Item not found", bestBuyInventory.checkItem(567001));
        Assert.assertEquals("Item #567003: 20 units on hand.", bestBuyInventory.checkItem(567003));
    }
}
