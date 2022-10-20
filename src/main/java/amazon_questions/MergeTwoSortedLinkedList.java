package amazon_questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <b>Merge Two Sorted Linked Lists</b> <br/>
 * Given two sorted lists, merge them so that the resulting list is also sorted.
 */
public class MergeTwoSortedLinkedList {
    public static List<Integer> mergeTwoSortedLinkedList(List<Integer> list1, List<Integer> list2) {
        if (list1.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }

        List<Integer> result = new ArrayList<>();

        int totalSize = list1.size() + list2.size();
        int pos1 = 0; // current index in the first array
        int pos2 = 0; // current index in the second array

        for (int i = 0; i < totalSize; i++) {
            System.out.println("Position 1: " + pos1 + " Position 2: " + pos2);
            // if the second array is exhausted or if both positions are valid and the current element in the first array is the lowest
            if (pos2 >= list2.size() || pos1 < list1.size() && list1.get(pos1).compareTo(list2.get(pos2)) < 0) {
                result.add(list1.get(pos1++));
            } else {
                result.add(list2.get(pos2++));
            }
        }
        return result;
    }
}
