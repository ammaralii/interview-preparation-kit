package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DistributeCandyTest {
    @Test
    public void success_distribute_test_0() {
        Assert.assertTrue(DistributeCandy.distribute(Arrays.asList(10, 12, 1, 4, 11, 7, 9, 17, 6, 2, 23)) == 20);
    }

    @Test
    public void success_distribute_test_1() {
        Assert.assertTrue(DistributeCandy.distribute(Arrays.asList(1, 5, 2, 1)) == 7);
    }
}
