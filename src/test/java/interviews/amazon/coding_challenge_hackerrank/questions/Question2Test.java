package interviews.amazon.coding_challenge_hackerrank.questions;

import org.junit.Assert;
import org.junit.Test;

public class Question2Test {
    /**
     * <b>Explanation</b>
     * <br/>A few examples of how you can pick the products (1 -based index):
     * <li>Choose subarray from indices (1, 2) and pick products [2, 9] respectively from each index, which is 11 products.</li>
     * <li>Choose subarray from indices (1, 4) and pick products [2, 3, 4, 7] , which is 16 products.</li>
     * <li>Choose subarray from indices (1, 5) and pick products [1, 2, 3, 4, 5], which is 15 products.</li>
     */
    @Test
    public void success_findMaxProducts_test_0() {
        Assert.assertEquals(Question2.findMaxProducts(new int[]{2,9,4,7,5,2}), 16);
    }

    /**
     * <b>Explanation</b>
     * <br/>Take all the products as they already are in increasing order
     */
    @Test
    public void success_findMaxProducts_test_1() {
        Assert.assertEquals(Question2.findMaxProducts(new int[]{2,5,6,7}), 20);
    }
}
