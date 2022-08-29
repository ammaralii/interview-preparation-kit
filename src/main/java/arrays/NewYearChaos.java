package arrays;

import java.util.LinkedList;
import java.util.List;

public class NewYearChaos {
    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        int minimumBribes = 0;
        Integer index = q.size() - 1;
        while (index >= 0) {
            int chaosPosition = q.get(index) - (index + 1);
            if (chaosPosition > 2) {
                System.out.println("Too chaotic");
                return;
            } else {
                int optimize = Math.max(0,q.get(index)-2);
                for (int i=index;i>=optimize;i--) {
                    if (q.get(index) < q.get(i)) {
                        minimumBribes++;
                    }
                }
            }
            index--;
        }
        System.out.println(minimumBribes);
    }
}
