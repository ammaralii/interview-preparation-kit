package arrays;

import java.util.LinkedList;
import java.util.List;

public class ArraysLeftRotation {
    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        LinkedList<Integer> list = new LinkedList<>(a);
        for (int i = 0; i < d; i++) {
            int first = list.get(0);
            list.remove(0);
            list.addLast(first);
            System.out.println("List is: " + list);
        }
        return list;
    }
}
