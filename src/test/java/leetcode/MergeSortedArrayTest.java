package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortedArrayTest {
    @Test
    public void success_merge_test_0() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        MergeSortedArray.merge(nums1, 3, new int[]{2, 4, 6}, 3);
        checkMergeResult(nums1, Arrays.asList(1, 2, 2, 3, 4, 6));
    }

    @Test
    public void success_merge_test_1() {
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        MergeSortedArray.merge(nums1, 3, new int[]{2, 4, 6}, 3);
        checkMergeResult(nums1, Arrays.asList(2, 4, 4, 5, 6, 6));
    }

    @Test
    public void success_merge_test_2() {
        int[] nums1 = new int[]{1, 5, 6, 0, 0, 0};
        MergeSortedArray.merge(nums1, 3, new int[]{2, 4, 6}, 3);
        checkMergeResult(nums1, Arrays.asList(1, 2, 4, 5, 6, 6));
    }

    @Test
    public void success_merge_test_3() {
        int[] nums1 = new int[]{1, 7, 8, 9, 0, 0, 0};
        MergeSortedArray.merge(nums1, 4, new int[]{2, 4, 6}, 3);
        checkMergeResult(nums1, Arrays.asList(1, 2, 4, 6, 7, 8, 9));
    }

    private void checkMergeResult(int[] nums1, List<Integer> actual) {
        List<Integer> result = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        Assert.assertEquals(result, actual);
    }
}
