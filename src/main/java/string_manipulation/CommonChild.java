package string_manipulation;

public class CommonChild {
    public static int commonChild(String s1, String s2) {
        int M = s1.length();
        int N = s2.length();

        int[][] arr = new int[M+1][N+1];
        for (int i = M-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    arr[i][j] = arr[i + 1][j + 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
                }
            }
        }
        int i = 0, j = 0;
        int count =0;
        while(i < M && j < N) {
            if (s1.charAt(i) == s2.charAt(j)) {
                count++;
                i++;
                j++;
            }
            else if (arr[i+1][j] >= arr[i][j+1]) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}
