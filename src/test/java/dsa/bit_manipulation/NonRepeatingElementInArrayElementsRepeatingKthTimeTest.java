package dsa.bit_manipulation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class NonRepeatingElementInArrayElementsRepeatingKthTimeTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(NonRepeatingElementInArrayElementsRepeatingKthTime.find(Arrays.asList(2,2,1,5,1,1,2), 3).equals(5));
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(NonRepeatingElementInArrayElementsRepeatingKthTime.find(Arrays.asList(5,5,5,10),3).equals(10));
    }

    @Test
    public void success_find_test_2() {
        Assert.assertTrue(NonRepeatingElementInArrayElementsRepeatingKthTime.find(Arrays.asList(5,5,5,5,10,2,10,10,10),4).equals(2));
    }
}
