package dsa.bit_manipulation;

import java.util.List;

/**
 * <b>only non repeating element in array</b> <br/>
 * Find the only non repeating element in array, where every element repeat twice
 */
public class NonRepeatingElementInArray {
    public static Integer find(List<Integer> list) {
        Integer result = list.get(0) ^ list.get(1);
        for (int i = 2; i < list.size(); i++) {
            result = result ^ list.get(i);
        }
        return result;
    }
}
