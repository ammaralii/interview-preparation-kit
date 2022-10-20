package amazon_questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SumOfTwoIntegersInArrayEqualsGivenValueTest {
    @Test
    public void success_findMissingNumberInArray_test_0() {
        List<Integer> arr = Arrays.asList(3, 7, 1, 2, 8, 4, 5);
        Assert.assertTrue(SumOfTwoIntegersInArrayEqualsGivenValue.isSumOfTwoIntegersInArrayEqualsGivenValue(arr, 10));
    }

    @Test
    public void success_findMissingNumberInArray_test_1() {
        List<Integer> arr = Arrays.asList(3, 7, 1, 2, 8, 4, 5);
        Assert.assertFalse(SumOfTwoIntegersInArrayEqualsGivenValue.isSumOfTwoIntegersInArrayEqualsGivenValue(arr, 0));
    }
}
