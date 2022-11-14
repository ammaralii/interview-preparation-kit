package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {
    @Test
    public void success_countDecreasingRatings_test_0() {
        Assert.assertTrue(RomanToInteger.romanToInt("MCMXCIV") == 1994);
    }
}
