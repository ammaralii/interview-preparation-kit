package leetcode;

public class Sqrt {
    public static int mySqrt(int x) {
        if (x < 2)
            return x;
        int left = 1, right = x/2;
        while (true) {
            int mid = left + (right - left) / 2;
            System.out.println("Mid is " + mid);
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}
