package amazon_questions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <b>Determine if the sum of two integers is equal to the given value</b> <br/>
 * Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to
 * the given value. Return true if the sum exists and return false if it does not.
 */
public class SumOfTwoIntegersInArrayEqualsGivenValue {
    //This is what most people do
    public static boolean isSumOfTwoIntegersInArrayEqualsGivenValue_1(List<Integer> list, Integer value) {
        list = list.stream().sorted().collect(Collectors.toList());
        int counter = 1;
        while (counter != list.size() && list.get(counter)<value){
            for (int i = 0; i < counter; i++) {
                if (list.get(i) + list.get(counter) == value) {
                    return true;
                }
            }
            counter++;
        }
        return false;
    }

    //This is optimized one
    public static boolean isSumOfTwoIntegersInArrayEqualsGivenValue(List<Integer> list, Integer value) {
        Set<Integer> foundValues = new HashSet<>();
        for (Integer a : list) {
            if (foundValues.contains(value - a)) {
                return true;
            }
            foundValues.add(a);
        }
        return false;
    }
}
