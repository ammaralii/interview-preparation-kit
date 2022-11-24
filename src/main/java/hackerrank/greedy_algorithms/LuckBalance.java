package hackerrank.greedy_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {
    public static int luckBalance(int k, List<List<Integer>> contests) {
        int luck = 0;
        List<Integer> importantContests = new ArrayList<>();
        for (int i = 0; i < contests.size(); i++) {
            luck += contests.get(i).get(0);
            if(contests.get(i).get(1) == 1){
                importantContests.add(contests.get(i).get(0));
            }
        }
        if (importantContests.size() == k){
            return luck;
        }
        Collections.sort(importantContests);
        for (int i = 0; i < importantContests.size() - k; i++) {
            luck -= 2 * importantContests.get(i);
        }
        return luck;
    }
}
