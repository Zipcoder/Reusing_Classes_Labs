import org.junit.Assert;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/18/17.
 */
public class ManagerTest {

    @Test
    public void testInitilization(){

        Product test = new Product(001, 500, 34.6);
        int expectedid = 1;
        int actual = test.getId();
        Assert.assertEquals("testing id number", expectedid,actual);
        int expectedQuantity = 500;
        int actualQuantity = test.getQuantity();
        Assert.assertEquals("Testing Quantity", expectedQuantity, actualQuantity);
        double expectedPrice = 34.6;
        double actualPrice =  test.getPrice();
        Assert.assertEquals("Testing price", expectedPrice,actualPrice,0);

    }

    @Test
    public void testTotalCost(){
        Product test = new Product(1,200,55.5);
        double expectedTotalCost = 11100;
        double actualTotaCost = test.getTotalCost();
        Assert.assertEquals("Testing total cost", expectedTotalCost,actualTotaCost,0);
    }


}
