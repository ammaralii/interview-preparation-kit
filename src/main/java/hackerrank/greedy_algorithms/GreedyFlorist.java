package hackerrank.greedy_algorithms;

import java.util.Arrays;

public class GreedyFlorist {
    public static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int cost = 0;
        int previousPurchaseCount = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            cost += (1 + (previousPurchaseCount / k)) * c[i];
            previousPurchaseCount++;
        }
        return cost;
    }
}
