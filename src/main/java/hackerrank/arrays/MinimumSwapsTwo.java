package hackerrank.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumSwapsTwo {
    public static int minimumSwaps(int[] arr) {
        return minimumSwapsUsingCustomAlgo(arr);
    }

    private static int minimumSwapsUsingCustomAlgo(int[] arr) {
        int n = arr.length - 1;
        int minSwaps = 0;
        for (int i = 0; i < n; i++) {
            if (i < arr[i] - 1) {
                System.out.println(Math.min(n, arr[i] - 1));
                swap(arr, i, Math.min(n, arr[i] - 1));
                minSwaps++;
                i--;
            }
            printArray(arr);
        }
        return minSwaps;
    }

    public static void printArray(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println("Array is: " + list);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int minimumSwapsUsingSelectionSort(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int index = 0, smallest = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                int toSwipe = arr[i];
                int withSwipe = smallest;
                arr[i] = withSwipe;
                arr[index] = toSwipe;
                count++;
            }
        }
        return count;
    }
}
