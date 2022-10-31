package amazon_questions.interviewbit;

import java.util.List;

public class MaxProductSubarray {
    public static Integer find(List<Integer> list) {
        // max positive product
        // ending at the current position
        Integer max_ending_here = list.get(0);

        // min negative product ending
        // at the current position
        Integer min_ending_here = list.get(0);

        // Initialize overall max product
        Integer max_so_far = list.get(0);

        // /* Traverse through the array.
        // the maximum product subarray ending at an index
        // will be the maximum of the element itself,
        // the product of element and max product ending previously
        // and the min product ending previously. */
        for (int i = 1; i < list.size(); i++) {
            Integer temp = Math.max(Math.max(list.get(i), list.get(i) * max_ending_here), list.get(i) * min_ending_here);
            min_ending_here = Math.min(Math.min(list.get(i), list.get(i) * max_ending_here), list.get(i) * min_ending_here);
            max_ending_here = temp;
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }
}
