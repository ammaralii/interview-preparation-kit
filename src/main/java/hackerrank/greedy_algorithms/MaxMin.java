package hackerrank.greedy_algorithms;

import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {
    public static int maxMin(int k, List<Integer> arr) {
        arr = arr.stream().sorted().collect(Collectors.toList());
        int min = Integer.MAX_VALUE;
        int i = 0;
        for (i = 0; (i + k - 1) < arr.size(); i++) {
            if (arr.get(i + k - 1) - arr.get(i) < min)
                min = arr.get(i + k - 1) - arr.get(i);
        }
        return min;
    }
}
