package amazon_questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PythagoreanTripletTest {
    @Test
    public void success_isTriplet_test_0() {
        List<Integer> arr = Arrays.asList(3, 1, 4, 6, 5);
        Assert.assertTrue(PythagoreanTriplet.isTriplet(arr));
    }

    @Test
    public void success_isTriplet_test_1() {
        List<Integer> arr = Arrays.asList(10, 4, 6, 12, 5);
        Assert.assertFalse(PythagoreanTriplet.isTriplet(arr));
    }

    @Test
    public void success_isTriplet_test_2() {
        List<Integer> arr = Arrays.asList(3, 4, 6, 5);
        Assert.assertTrue(PythagoreanTriplet.isTriplet(arr));
    }
}
