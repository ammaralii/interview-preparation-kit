package amazon_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <b>k largest(or smallest) elements in an array</b> <br/>
 * Write an efficient program for printing k largest elements in an array. Elements in an array can be in any order.
 */
public class KLargestOrSmallestElements {
    public enum KLargestOrSmallestElementsEnum {
        SMALLEST, LARGEST
    }

    /**
     * @param list
     * @param k
     * @param value
     * @return
     */
    public static List<Integer> kSmallestOrLargest(List<Integer> list, Integer k, KLargestOrSmallestElementsEnum value) {
        if (list.isEmpty()) {
            return list;
        }
        list = list.stream().sorted().collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        if (value.equals(KLargestOrSmallestElementsEnum.SMALLEST)) {
            for (int i = 0; i < k; i++) {
                result.add(list.get(i));
            }
        } else if (value.equals(KLargestOrSmallestElementsEnum.LARGEST)) {
            for (int i = (list.size() - k); i < list.size(); i++) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
