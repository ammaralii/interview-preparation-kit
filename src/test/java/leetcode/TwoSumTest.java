package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void success_containingAnyCombination_test_0() {
        int[] result = TwoSum.twoSum(new int[]{3,2,4}, 6);
        Assert.assertEquals(result[0], 1);
        Assert.assertEquals(result[1], 2);
    }
}
