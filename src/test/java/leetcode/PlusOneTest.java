package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {
    @Test
    public void success_plusOne_test_0() {
        int[] result = PlusOne.plusOne(new int[]{1, 2, 3, 4});
        Assert.assertEquals(result[result.length - 1], 5);
    }

    @Test
    public void success_plusOne_test_1() {
        int[] result = PlusOne.plusOne(new int[]{1, 2, 9, 9});
        Assert.assertEquals(result[result.length - 2], 0);
    }

    @Test
    public void success_plusOne_test_2() {
        int[] result = PlusOne.plusOne(new int[]{2, 9, 9});
        Assert.assertEquals(result[result.length - 3], 3);
    }

    @Test
    public void success_plusOne_test_3() {
        int[] result = PlusOne.plusOne(new int[]{9, 9, 9});
        Assert.assertEquals(result[result.length - 4], 1);
    }
}
