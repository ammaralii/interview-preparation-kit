package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {
    @Test
    public void success_climbStairs_test_0() {
        Assert.assertEquals(ClimbingStairs.climbStairs(2), 2);
    }

    @Test
    public void success_climbStairs_test_1() {
        Assert.assertEquals(ClimbingStairs.climbStairs(3), 3);
    }

    @Test
    public void success_climbStairs_test_2() {
        Assert.assertEquals(ClimbingStairs.climbStairs(5), 8);
    }

    @Test
    public void success_climbStairs_test_3() {
        Assert.assertEquals(ClimbingStairs.climbStairs(45), 1836311903);
    }
}
