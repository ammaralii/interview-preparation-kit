package interviews.aurora_solutions.coding_challenge_coderbyte.question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public static String ArrayChallenge(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int sum = Arrays.stream(arr).sum() - max;

        if (sum < max) {
            return "false";
        }

        Map<Integer, Boolean> memo = new HashMap<>();
        memo.put(0, true);

        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i];
            for (int j = max - curr; j >= 0; j--) {
                if (memo.containsKey(j)) {
                    memo.put(j + curr, true);
                }
            }
        }

        return memo.getOrDefault(max, false) ? "true" : "false";
    }
}
