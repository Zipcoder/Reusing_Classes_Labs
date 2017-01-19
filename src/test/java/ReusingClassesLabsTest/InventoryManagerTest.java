package ReusingClassesLabsTest;

import ReusingClassesLabs.InventoryManager;
import ReusingClassesLabs.Product;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by randallcrame on 1/18/17.
 */
public class InventoryManagerTest {

    Product pepsi = new Product("pepsi",3.92, 2000);
    InventoryManager inventoryListHouston = new InventoryManager();
    @Test
    public void sumOfInventoryTest(){
        inventoryListHouston.addToInventory(pepsi);
        double expected = 7840;
        double actual = inventoryListHouston.sumOfInventory();
        Assert.assertEquals(expected,actual, 0.0);
    }
}
