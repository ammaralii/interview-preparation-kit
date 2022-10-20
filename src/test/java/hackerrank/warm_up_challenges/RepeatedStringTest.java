package hackerrank.warm_up_challenges;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {
    @Test
    public void success_jumpingOnClouds_example() {
        Assert.assertEquals(RepeatedString.repeatedString("abcac", 10), 4);
    }

    @Test
    public void success_jumpingOnClouds_test_0() {
        Assert.assertEquals(RepeatedString.repeatedString("aba", 10), 7);
    }

    @Test
    public void success_jumpingOnClouds_test_1() {
        Assert.assertEquals(RepeatedString.repeatedString("a", 1000000000000l), 1000000000000l);
    }
}
