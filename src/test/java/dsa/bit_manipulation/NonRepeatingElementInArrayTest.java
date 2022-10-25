package dsa.bit_manipulation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class NonRepeatingElementInArrayTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(NonRepeatingElementInArray.find(Arrays.asList(5,4,1,4,3,5,1)).equals(3));
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(NonRepeatingElementInArray.find(Arrays.asList(5,5)).equals(0));
    }
}
