package hackerrank.warm_up_challenges;

import java.util.HashSet;
import java.util.List;

public class SalesByMatch {
    /**
     * The function is expected to return an INTEGER.
     * @param n Integer: the number of socks in the pile
     * @param ar Integer Array: the colors of each sock
     * @return
     */
    public static int sockMerchant(Integer n, List<Integer> ar)
    {
        HashSet<Integer> socks = new HashSet<>();
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(socks.contains(ar.get(i)))
            {
                System.out.println(String.format("Pair found pair value is: %d", ar.get(i)));
                count++;
                socks.remove(ar.get(i));
            }
            else
                socks.add(ar.get(i));
        }
        System.out.println(String.format("Total count is: %d", count));
        return count;
    }

}