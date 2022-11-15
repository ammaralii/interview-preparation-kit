package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {
    @Test
    public void success_mergeTwoLists_test_0() {
        MergeTwoSortedLists.ListNode list1 = new MergeTwoSortedLists.ListNode(
                1, new MergeTwoSortedLists.ListNode(2, new MergeTwoSortedLists.ListNode(4))
        );
        MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(
                1, new MergeTwoSortedLists.ListNode(3, new MergeTwoSortedLists.ListNode(4))
        );
        MergeTwoSortedLists.ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        MergeTwoSortedLists.ListNode actual = new MergeTwoSortedLists.ListNode(
                1, new MergeTwoSortedLists.ListNode(1, new MergeTwoSortedLists.ListNode(
                2, new MergeTwoSortedLists.ListNode(3, new MergeTwoSortedLists.ListNode(
                4, new MergeTwoSortedLists.ListNode(4)))))
        );
        while (actual != null && result!=null){
            Assert.assertEquals(result.val, actual.val);
            result = result.next;
            actual = actual.next;
        }
    }

    @Test
    public void success_mergeTwoLists_test_1() {
        MergeTwoSortedLists.ListNode list1 = new MergeTwoSortedLists.ListNode(2);
        MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(1);
        MergeTwoSortedLists.ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        MergeTwoSortedLists.ListNode actual = new MergeTwoSortedLists.ListNode(1, new MergeTwoSortedLists.ListNode(2));
        while (actual != null && result!=null){
            Assert.assertEquals(result.val, actual.val);
            result = result.next;
            actual = actual.next;
        }
    }
}
