package dsa.mathematics_and_number_theory;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumbersTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(PalindromeNumbers.find(404));
    }

    @Test
    public void failure_find_test_1() {
        Assert.assertFalse(PalindromeNumbers.find(521));
    }
}
