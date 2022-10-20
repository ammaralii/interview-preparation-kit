package hackerrank.dynamic_programming;

import org.junit.Assert;
import org.junit.Test;

public class MaxArraySumTest {
    @Test
    public void success_maxSubsetSum_test_0() {
        Assert.assertEquals(MaxArraySum.maxSubsetSum(new int[]{3, 7, 4, 6, 5}), 13);
    }

    @Test
    public void success_maxSubsetSum_test_1() {
        Assert.assertEquals(MaxArraySum.maxSubsetSum(new int[]{2, 1, 5, 8, 4}), 11);
    }

    @Test
    public void success_maxSubsetSum_test_2() {
        Assert.assertEquals(MaxArraySum.maxSubsetSum(new int[]{3, 5, -7, 8, 10}), 15);
    }
}
