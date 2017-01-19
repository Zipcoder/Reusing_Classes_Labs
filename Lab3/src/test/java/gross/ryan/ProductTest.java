package gross.ryan;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ryangross on 1/18/17.
 */
public class ProductTest {
    Product xboxOneSlim = new Product(249.99, 5613802, 250);
    Product nintendoSwitch = new Product(299.99, 567003, 20);

    @Test
    public void totalInventoryValueTest() {
        Assert.assertEquals(62498.00, xboxOneSlim.totalValue(), 1.00);
        Assert.assertEquals(6000.00, nintendoSwitch.totalValue(), 1.00);
    }

}
