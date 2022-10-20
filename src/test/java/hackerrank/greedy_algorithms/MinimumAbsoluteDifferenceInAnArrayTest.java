package hackerrank.greedy_algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceInAnArrayTest {
    @Test
    public void success_minimumAbsoluteDifference_test_0() {
        Assert.assertEquals(MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(Arrays.asList(3, -7, 0)), 3);
    }

    @Test
    public void success_minimumAbsoluteDifference_test_1() {
        Assert.assertEquals(
                MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(
                        Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75)
                ), 1
        );
    }

    @Test
    public void success_minimumAbsoluteDifference_test_2() {
        Assert.assertEquals(
                MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(
                        Arrays.asList(1, -3, 71, 68, 17)
                ), 3
        );
    }
}
