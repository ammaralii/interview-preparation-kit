package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MaxProductSubarrayTest {

    @Test
    public void success_find_test_0() {
        Assert.assertTrue(MaxProductSubarray.find(Arrays.asList(2, 3, -2, 4)) == 6);
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(MaxProductSubarray.find(Arrays.asList(1, -2, -3, 0, 7, -8, -2)) == 112);
    }
}
