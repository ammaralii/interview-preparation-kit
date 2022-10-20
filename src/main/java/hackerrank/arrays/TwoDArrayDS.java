package hackerrank.arrays;

import java.util.List;

public class TwoDArrayDS {
    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            List<Integer> arr1 = arr.get(i);
            List<Integer> arr2 = arr.get(i + 1);
            List<Integer> arr3 = arr.get(i + 2);
            for(int j=0;j<4;j++) {
                System.out.println(arr1.get(j) + " " + arr1.get(j + 1) + " " + arr1.get(j + 2));
                System.out.println("  " + arr2.get(j + 1));
                System.out.println(arr3.get(j) + " " + arr3.get(j + 1) + " " + arr3.get(j + 2));
                Integer sum = arr1.get(j) + arr1.get(j + 1) + arr1.get(j + 2) + arr2.get(j + 1) + arr3.get(j) + arr3.get(j + 1) + arr3.get(j + 2);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
