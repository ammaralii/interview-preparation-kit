package dsa.bit_manipulation;

import java.util.List;

/**
 * <b>Two non repeating element in array</b> <br/>
 * Find the two non repeating element in array, where every element repeat twice
 */
public class NonRepeatingElementInArrayElementsRepeatingKthTime {
    public static Integer find(List<Integer> list, int k) {
        Integer result = list.get(0) ^ list.get(1);
        Integer binarySum = Integer.valueOf(Integer.toBinaryString(list.get(0))) + Integer.valueOf(Integer.toBinaryString(list.get(1)));
        for (int i = 2; i < list.size(); i++) {
            result = result ^ list.get(i);
            binarySum += Integer.valueOf(Integer.toBinaryString(list.get(i)));
        }
        char[] binarySumBits = String.valueOf(binarySum).toCharArray();
        StringBuilder resultBits = new StringBuilder("");
        for (char c : binarySumBits) {
            Integer temp = Integer.valueOf(c);
            resultBits.append(temp % k);
        }
        return Integer.parseInt(resultBits.toString(), 2);
    }
}
