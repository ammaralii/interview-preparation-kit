package interviews.teamapt.online_assessment.questions;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Question2Test {
    /**price - ((discount / 100f) * price)
     * <b>Explanation</b><br/>
     * <li>First, a call is made to API <a href="https://jsonmock.hackerrank.com/api/inventory?barcode=74002314">https://jsonmock.hackerrank.com/api/inventory?barcode=74002314</a>. The
     * price = 3705 and discount = 20.</li>
     */
    @Test
    public void success_getDiscountedPrice_test_0() throws IOException {
        Assert.assertEquals(Question2.getDiscountedPrice(74002314), 2964);
    }

    /**
     * <b>Explanation</b><br/>
     * <li>First, a call is made to API <a href="https://jsonmock.hackerrank.com/api/inventory?barcode=74002314">https://jsonmock.hackerrank.com/api/inventory?barcode=74002314</a>. The data
     * field contains an empty array, so the item was not found.</li>
     */
    @Test
    public void success_getDiscountedPrice_test_1() throws IOException {
        Assert.assertEquals(Question2.getDiscountedPrice(74005364), -1);
    }
}
