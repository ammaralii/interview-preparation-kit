package amazon_questions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <b>Find the missing number in the array</b> <br/>
 * You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n are present except one
 * number x. You have to find x. The input array is not sorted. Look at the below array and give it a try before
 * checking the solution.
 */
public class MissingNumberInArray {
    //This is what most people do
    public static Integer findMissingNumberInArray_1(List<Integer> list) {
        list = list.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            if (i + 1 != list.get(i)) {
                return list.get(i) - 1;
            }
        }
        return 0;
    }

    //This is optimized one
    public static Integer findMissingNumberInArray(List<Integer> list) {
        if (list.isEmpty()) {
            return -1;
        }
        Integer size = list.size();
        System.out.println(size);
        Integer sum = ((size + 1) * (size + 2)) / 2;
        for (int i = 0; i < size; i++) {
            sum -= list.get(i);
        }
        System.out.println(sum);
        if (sum == size + 1) {
            return -1;
        }
        return sum;
    }
}
