package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSortCountingInversions {
    public static long countInversions(List<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) > arr.get(j)) {
                    swap(arr, i, j);
                    inv_count++;
                }
            }
        }
        System.out.println(arr);

        return inv_count;
    }

    private static void swap(List<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    public static long countInversionsOptimized(List<Integer> arr) {
        List<Integer> aux = new ArrayList<>(arr);
        return sort(arr, 0, arr.size() - 1, aux);
    }

    private static long sort(List<Integer> array, int left, int right, List<Integer> aux) {
        if (left >= right) {
            return 0;
        }
        int mid = (left + right) / 2;
        long a = sort(aux, left, mid, array);
        long b = sort(aux, mid + 1, right, array);
        long c = merge(array, left, mid, right, aux);
        return a + b + c;
    }

    private static long merge(List<Integer> array, int left, int mid, int right,
                              List<Integer> aux) {
        int idx = left;
        int left1 = left;
        int right1 = mid;
        int left2 = mid + 1;
        int right2 = right;
        long count = 0;
        while (left1 <= right1 && left2 <= right2) {
            if (aux.get(left1) <= aux.get(left2)) {
                array.set(idx++, aux.get(left1));
                left1++;
            } else {
                array.set(idx++, aux.get(left2));
                count += (mid - left1 + 1);
                left2++;
            }
        }
        while (left1 <= right1) {
            array.set(idx++, aux.get(left1));
            left1++;
        }
        while (left2 <= right2) {
            array.set(idx++, aux.get(left2));
            left2++;
        }
        return count;
    }

}
