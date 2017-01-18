package mccann.kevin.classmanager;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class InventoryTest {

    @Test
    public void valueOfSingleItem(){
        Inventory manager = new Inventory();
        Product thing = new Product(4, "ham", 4);
        double expected = 16.0;
        double actual = manager.valueOfSingleItem(thing);
        assertEquals("16 expected",expected,actual, 0);

    }
}
