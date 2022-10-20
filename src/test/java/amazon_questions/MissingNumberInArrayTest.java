package amazon_questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MissingNumberInArrayTest {
    @Test
    public void success_findMissingNumberInArray_test_0() {
        List<Integer> arr = Arrays.asList(3, 7, 1, 2, 8, 4, 5);
        Assert.assertTrue(MissingNumberInArray.findMissingNumberInArray(arr) == 6);
    }

    @Test
    public void success_findMissingNumberInArray_test_1() {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8);
        Assert.assertTrue(MissingNumberInArray.findMissingNumberInArray(arr) == -1);
    }

    @Test
    public void success_findMissingNumberInArray_test_2() {
        List<Integer> arr = Arrays.asList(9, 6, 4, 2, 3, 5, 7, 1);
        Assert.assertTrue(MissingNumberInArray.findMissingNumberInArray(arr) == 8);
    }
}
