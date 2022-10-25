package dsa.bit_manipulation;

import java.util.List;

/**
 * <b>Two non repeating element in array</b> <br/>
 * Find the two non repeating element in array, where every element repeat twice
 */
public class TwoNonRepeatingElementInArray {
    public static String find(List<Integer> list) {
        Integer result = list.get(0) ^ list.get(1);
        for (int i = 2; i < list.size(); i++) {
            result ^= list.get(i);
        }

        Integer evenResult = result;
        Integer oddResult = result;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) & 1) == 0) {
                oddResult ^= list.get(i);
            } else {
                evenResult ^= list.get(i);
            }
        }
        return oddResult + " " + evenResult;
    }
}
