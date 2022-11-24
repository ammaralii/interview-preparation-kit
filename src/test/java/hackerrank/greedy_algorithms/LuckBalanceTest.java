package hackerrank.greedy_algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckBalanceTest {
    @Test
    public void success_luckBalance_test_0() {
        List<List<Integer>> contests = new ArrayList<>();
        contests.add(Arrays.asList(5,1));
        contests.add(Arrays.asList(2,1));
        contests.add(Arrays.asList(1,1));
        contests.add(Arrays.asList(8,1));
        contests.add(Arrays.asList(10,0));
        contests.add(Arrays.asList(5,0));
        Assert.assertEquals(LuckBalance.luckBalance(3, contests), 29);
    }

    @Test
    public void success_luckBalance_test_1() {
        List<List<Integer>> contests = new ArrayList<>();
        contests.add(Arrays.asList(13,1));
        contests.add(Arrays.asList(10,1));
        contests.add(Arrays.asList(9,1));
        contests.add(Arrays.asList(8,1));
        contests.add(Arrays.asList(13,1));
        contests.add(Arrays.asList(12,1));
        contests.add(Arrays.asList(18,1));
        contests.add(Arrays.asList(13,1));
        Assert.assertEquals(LuckBalance.luckBalance(5, contests), 42);
    }

    @Test
    public void success_luckBalance_test_2() {
        List<List<Integer>> contests = new ArrayList<>();
        contests.add(Arrays.asList(5,1));
        contests.add(Arrays.asList(4,0));
        contests.add(Arrays.asList(6,1));
        contests.add(Arrays.asList(2,1));
        contests.add(Arrays.asList(8,0));
        Assert.assertEquals(LuckBalance.luckBalance(2, contests), 21);
    }
}
