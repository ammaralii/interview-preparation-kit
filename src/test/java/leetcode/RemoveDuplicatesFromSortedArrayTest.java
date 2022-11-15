package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void success_countDecreasingRatings_test_0() {
        Assert.assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1,1,2,2,3,3}), 3);
    }
}
