package amazon_questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLinkedListTest {
    @Test
    public void success_findMissingNumberInArray_test_0() {
        List<Integer> list1 = Arrays.asList(1,2,6,8);
        List<Integer> list2 = Arrays.asList(1,3,4,6,9);
        List<Integer> result = Arrays.asList(1,1,2,3,4,6,6,8,9);
        Assert.assertTrue(MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(list1,list2).equals(result));
    }

    @Test
    public void success_findMissingNumberInArray_test_1() {
        List<Integer> list1 = Arrays.asList(1,2,6);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> result = Arrays.asList(1,2,3,4,6);
        Assert.assertTrue(MergeTwoSortedLinkedList.mergeTwoSortedLinkedList(list1,list2).equals(result));
    }
}
