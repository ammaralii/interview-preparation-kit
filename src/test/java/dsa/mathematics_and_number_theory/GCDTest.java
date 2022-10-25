package dsa.mathematics_and_number_theory;

import org.junit.Assert;
import org.junit.Test;

public class GCDTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(GCD.find(24, 60) == 12);
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(GCD.find(100, 1000) == 100);
    }
}
