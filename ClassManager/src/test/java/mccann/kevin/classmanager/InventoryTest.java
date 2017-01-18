package mccann.kevin.classmanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class InventoryTest {

    Inventory manager;
    Product ham, cheese, bread, thing;

    @Before
    public void setUp() {
        manager = new Inventory();
        ham = new Product(2.20, "ham", 4);
        cheese = new Product(5.65, "cheese", 34);
        bread = new Product(1.20, "bread", 66);
        thing = new Product(4, "ham", 4);
        manager.addItemToInventory(ham);
        manager.addItemToInventory(cheese);
        manager.addItemToInventory(bread);
        manager.addItemToInventory(thing);
    }

    @Test
    public void valueOfSingleItem(){
        Inventory manager = new Inventory();
        Product ham = new Product(2.20, "ham", 4);
        Product cheese = new Product(5.65, "cheese", 34);
        Product bread = new Product(1.20, "bread", 66);
        Product thing = new Product(4, "ham", 4);
        double expected = 16.0;
        double actual = manager.valueOfSingleItem(thing);
        assertEquals("16 expected",expected,actual, 0);
    }

    @Test
    public void sumOfInventoryTest(){
        double expected = 296.1;
        double actual = manager.sumOfInventoryValue();
        assertEquals("296.1 expected",expected,actual,0);
    }
}
