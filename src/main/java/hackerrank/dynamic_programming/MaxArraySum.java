package hackerrank.dynamic_programming;

public class MaxArraySum {
    public static int maxSubsetSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        arr[0] = Math.max(0, arr[0]);
        if (arr.length == 1) {
            return arr[0];
        }
        arr[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            arr[i] = Math.max(arr[i - 1], arr[i] + arr[i - 2]);
        }
        return arr[arr.length - 1];
    }
}
