package dsa.mathematics_and_number_theory;

import org.junit.Assert;
import org.junit.Test;

public class TrailingZeroInFactorialTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(TrailingZeroInFactorial.find(5) == 1);
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(TrailingZeroInFactorial.find(10) == 2);
    }

    @Test
    public void success_find_test_2() {
        Assert.assertTrue(TrailingZeroInFactorial.find(1000) == 249);
    }
}
