package interviews.amazon.questions;

import java.util.List;


//def maxSetSize(riceBags):
//    # sort the lst in increasing order
//    riceBags.sort()
//
//    n = len(riceBags)
//
//    # create a dp array of size n and initialise values with 1
//    dp = [1]*n
//
//    # traverse lst from i=0 to end of lst
//    for i in range(n):
//        # traverse lst from j=i-1 to 0
//        for j in range(i-1, -1, -1):
//            # if following condition passes, then update dp[i] with max(dp[i], dp[j]+1)
//            if riceBags[j]*riceBags[j] == riceBags[i]:
//                dp[i] = max([dp[i], 1+dp[j]])
//
//    # if max(dp) == 1, then return -1
//    if max(dp) == 1 :
//        return -1
//
//    # else return max(dp) which is the max perfect set size
//    return max(dp)
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
