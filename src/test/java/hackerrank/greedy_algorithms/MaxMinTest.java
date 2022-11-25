package hackerrank.greedy_algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MaxMinTest {
    @Test
    public void success_getMinimumCost_test_0() {
        Assert.assertEquals(MaxMin.maxMin(3, Arrays.asList(10, 100, 300, 200, 1000, 20, 30)), 20);
    }

    @Test
    public void success_getMinimumCost_test_1() {
        Assert.assertEquals(MaxMin.maxMin(4, Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200)), 3);
    }

    @Test
    public void success_getMinimumCost_test_2() {
        Assert.assertEquals(MaxMin.maxMin(2, Arrays.asList(1, 2, 1, 2, 1)), 0);
    }
}
