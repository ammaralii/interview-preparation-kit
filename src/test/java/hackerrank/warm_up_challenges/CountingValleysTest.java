package hackerrank.warm_up_challenges;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {
    @Test
    public void success_countingValleys_example() {
        Assert.assertEquals(CountingValleys.countingValleys(8,"DDUUUUDD"), 1);
    }

    @Test
    public void success_countingValleys_test_1() {
        Assert.assertEquals(CountingValleys.countingValleys(8,"UDDDUDUU"), 1);
    }

    @Test
    public void success_countingValleys_test_2() {
        Assert.assertEquals(CountingValleys.countingValleys(12,"DDUUDDUDUUUD"), 2);
    }
}
