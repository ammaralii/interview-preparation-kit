package dsa.bit_manipulation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoNonRepeatingElementInArrayTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(TwoNonRepeatingElementInArray.find(Arrays.asList(5,4,1,4,3,5,1,2)).equals("3 2"));
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(TwoNonRepeatingElementInArray.find(Arrays.asList(5,5,3,4)).equals("3 4"));
    }
}
