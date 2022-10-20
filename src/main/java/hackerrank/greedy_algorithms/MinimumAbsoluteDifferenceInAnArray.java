package hackerrank.greedy_algorithms;

import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int difference = Math.abs(arr.get(0) - arr.get(1));
        for (int i = 1 ; i < arr.size(); i++) {
            int tempDifference = Math.abs(arr.get(i) - arr.get(i - 1));
            if (tempDifference<difference){
                difference = tempDifference;
            }
        }
        return difference;
    }
}
