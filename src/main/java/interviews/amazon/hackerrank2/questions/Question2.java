package interviews.amazon.hackerrank2.questions;

public class Question2 {
    public static int findMaxProducts(int[] products) {
        int answer = products[0];
        int n = products.length;

        for (int i = 1; i < n; i++) {
            int l = products[i];
            int p = products[i];
            int a = products[i];
            for (int j = i - 1; j >= 0; j--) {
                if (products[j] >= p) {
                    l += (a - 1);
                    a = a - 1;
                } else {
                    if (products[j] < (a - 1)) {
                        l += products[j];
                        a = products[j];
                    } else {
                        l += (a - 1);
                        a = a - 1;
                    }
                }
            }
            answer = Math.max(l, answer);
        }
        return answer;
    }
}
