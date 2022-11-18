package interviews.amazon.coding_challenge_hackerrank.questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Question4Test {
    @Test
    public void success_countDecreasingRatings_test_0() {
        Assert.assertTrue(Question4.findMaximumSustainableClusterSize(Arrays.asList(10,8,7), Arrays.asList(11,12,19), 6).equals(0));
    }

    @Test
    public void success_countDecreasingRatings_test_1() {
        Assert.assertTrue(Question4.findMaximumSustainableClusterSize(Arrays.asList(4,1,4,5,3), Arrays.asList(8,8,10,9,12), 33).equals(2));
    }
}
