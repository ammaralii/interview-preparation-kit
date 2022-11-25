package hackerrank.greedy_algorithms;

import org.junit.Assert;
import org.junit.Test;

public class GreedyFloristTest {
    @Test
    public void success_getMinimumCost_test_0() {
        Assert.assertEquals(GreedyFlorist.getMinimumCost(3, new int[]{2, 5, 6}), 13);
    }

    @Test
    public void success_getMinimumCost_test_1() {
        Assert.assertEquals(GreedyFlorist.getMinimumCost(2, new int[]{2, 5, 6}), 15);
    }

    @Test
    public void success_getMinimumCost_test_2() {
        Assert.assertEquals(GreedyFlorist.getMinimumCost(3, new int[]{1, 3, 5, 7, 9}), 29);
    }
}
