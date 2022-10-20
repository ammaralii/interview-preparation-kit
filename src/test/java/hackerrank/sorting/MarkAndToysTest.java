package hackerrank.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MarkAndToysTest {
    @Test
    public void success_maximumToys_test_0() {
        Assert.assertEquals(MarkAndToys.maximumToys(Arrays.asList(1, 12, 5, 111, 200, 1000, 10), 50), 4);
    }

    @Test
    public void success_maximumToys_test_1() {
        Assert.assertEquals(MarkAndToys.maximumToys(Arrays.asList(1, 2, 3, 4), 7), 3);
    }

    @Test
    public void success_maximumToys_test_2() {
        Assert.assertEquals(MarkAndToys.maximumToys(Arrays.asList(3, 7, 2, 9, 4), 15), 3);
    }
}
