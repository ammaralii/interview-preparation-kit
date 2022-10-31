package amazon_questions.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static int lis(List<Integer> arr)
    {
        int i, j, max = 0, n = arr.size();
        List<Integer> lis = new ArrayList<>();

        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis.add(1);

        /* Compute optimized LIS values in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr.get(i) > arr.get(j) && lis.get(i) < lis.get(j) + 1)
                    lis.set(i, lis.get(j) + 1);

        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis.get(i))
                max = lis.get(i);

        return max;
    }
}
