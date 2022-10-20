package hackerrank.warm_up_challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class JumpingOnTheCloudsTest {
    @Test
    public void success_jumpingOnClouds_example() {
        Assert.assertEquals(JumpingOnTheClouds.jumpingOnClouds(Arrays.asList(0,1,0,0,0,1,0)), 3);
    }

    @Test
    public void success_jumpingOnClouds_test_0() {
        Assert.assertEquals(JumpingOnTheClouds.jumpingOnClouds(Arrays.asList(0,0,1,0,0,1,0)), 4);
    }

    @Test
    public void success_jumpingOnClouds_test_1() {
        Assert.assertEquals(JumpingOnTheClouds.jumpingOnClouds(Arrays.asList(0,0,0,1,0,0)), 3);
    }
}
