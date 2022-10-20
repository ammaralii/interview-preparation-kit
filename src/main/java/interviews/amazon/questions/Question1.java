package interviews.amazon.questions;

import java.util.List;

public class Question1 {
    public static Integer countDecreasingRatings(List<Integer> ratings) {
        Integer n = ratings.size();
        if (n == 0) return 0;
        Integer i = 0;
        Integer result = 1;
        for (int j = 1; j < n; j++) {
            if ((ratings.get(j - 1) - ratings.get(j)) == 1) {
                result += (j - i + 1);
            } else {
                i = j;
                result += 1;
            }

        }
        return result;
    }
}
