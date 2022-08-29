package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MinimumSwapsTwoTest {
    @Test
    public void success_minimumSwaps_example() {
        int[] arr = new int[]{4,3,1,2};
        Assert.assertEquals(MinimumSwapsTwo.minimumSwaps(arr), 3);
    }

    @Test
    public void success_minimumSwaps_test_0() {
        int[] arr = new int[]{2,3,4,1,5};
        Assert.assertEquals(MinimumSwapsTwo.minimumSwaps(arr), 3);
    }

    @Test
    public void success_minimumSwaps_test_1() {
        int[] arr = new int[]{1,3,5,2,4,6,7};
        Assert.assertEquals(MinimumSwapsTwo.minimumSwaps(arr), 3);
    }
}
