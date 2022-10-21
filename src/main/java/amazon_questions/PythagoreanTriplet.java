package amazon_questions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <b>Pythagorean Triplet in an array</b> <br/>
 * Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies
 * a2 + b2 = c2.
 */
public class PythagoreanTriplet {
    //This is what most people do
    public static boolean isTriplet_1(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    int a = list.get(i);
                    int b = list.get(j);
                    int c = list.get(k);
                    if (a * a + b * b == c * c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //This is optimized one
    public static boolean isTriplet(List<Integer> list) {
        if (list.size() < 3) {
            return false;
        }
        list = list.stream().map(l -> l * l).sorted().collect(Collectors.toList());
        System.out.println(list);
        int aIndex = 0;
        int bIndex = list.size() - 2;
        int cIndex = list.size() - 1;
        while (aIndex != bIndex) {
            if (list.get(cIndex) == list.get(aIndex) + list.get(bIndex)) {
                return true;
            }
            if (aIndex + 1 == bIndex) {
                bIndex--;
                cIndex--;
                aIndex = 0;
            } else {
                aIndex++;
            }
        }
        return false;
    }
}
