package interviews.amazon.hackerrank2.questions;

import java.util.*;

public class Question1 {
    public static int maxSetSize(int[] riceBags) {
        return solution2(riceBags);
    }

    /**
     * Firstly I solved it using this solution but 7 test cases are failing due to timeout as you see in traverse 2 nested
     * loops which is causing impact so check the solution2 to check how I optimized it.
     * <br/><b>Complexity:</b> O(n^2)
      */
    private static int solution1(int[] riceBags) {
        //sort the lst in increasing order
        Arrays.sort(riceBags);

        int n = riceBags.length;
        // create a dp array of size n and initialise values with 1
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        //traverse lst from i=0 to end of lst
        for (int i = 0; i < n; i++) {
            //traverse lst from j=i-1 to 0
            for (int j = i - 1; j > -1; j--) {
                //if following condition passes, then update dp[i] with max(dp[i], dp[j]+1)
                if (riceBags[j] * riceBags[j] == riceBags[i]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }

        Arrays.stream(dp).forEach(System.out::println);

        OptionalInt max = Arrays.stream(dp).max();


        //if max(dp) == 1, then return -1
        if (max.getAsInt() == 1) {
            return -1;
        }

        //else return max(dp) which is the max perfect set size
        return max.getAsInt();
    }

    /**
     * as sorting is happening and java use merge sort so complexity of merge sort is
     * <br/><b>Complexity:</b> O(nlog(n))
     */
    private static int solution2(int[] riceBags) {
        Arrays.sort(riceBags);

        Map<Integer, Integer> riceBagsSetMap = new HashMap<>();
        for (int i = riceBags.length - 1; i >= 0; i--) {
            int product = riceBags[i] * riceBags[i];
            if (riceBagsSetMap.containsKey(product)) {
                int value = riceBagsSetMap.get(product);
                riceBagsSetMap.remove(product);
                riceBagsSetMap.put(riceBags[i], value + 1);
            } else {
                riceBagsSetMap.put(riceBags[i], 1);
            }
        }
        System.out.println(riceBagsSetMap);
        return Collections.max(riceBagsSetMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getValue();
    }
}
