package leetcode;

public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if (list1.val > list2.val) {
            ListNode temp = list2;
            list2 = list1;
            list1 = temp;
        }
        ListNode realHead = list1;
        while (list1.next != null && list2 != null) {
            if (list1.next.val <= list2.val) {
                list1 = list1.next;
            } else {
                ListNode temp = list1.next;
                list1.next = list2;
                list2 = list2.next;
                list1.next.next = temp;
                list1 = list1.next;
            }
        }
        if (list2 != null) list1.next = list2;
        return realHead;
    }
}
