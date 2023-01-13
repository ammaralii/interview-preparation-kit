package interviews.remotebase.coding_challenge_hackerrank.question;

import java.util.Arrays;

public class Question4 {
    /*
     * Complete the 'mergePalindromes' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */
    public static String mergePalindromes(String s1, String s2) {
        int[] countA = new int[26];
        int[] countB = new int[26];

        for (char ch : s1.toCharArray()) {
            countA[ch - 'a'] += 1;
        }

        for (char ch : s2.toCharArray()) {
            countB[ch - 'a'] += 1;
        }

        String mid = "";
        String res = "";
        for (int i = 0; i < 26; i++) {

            char curr = (char) (i + 'a');

            if (countA[i] % 2 == 1 && countB[i] % 2 == 1 && mid.length() < 2) {
                mid = String.valueOf(curr) + curr;
            }

            if ((countA[i] % 2 == 1 || countB[i] % 2 == 1) && mid.length() == 0) {
                mid = String.valueOf(curr);
            }

            res += new String(new char[countA[i] / 2 + countB[i] / 2]).replace("\0", String.valueOf(curr));

        }

        if (mid.length() == 2) {
            char[] resChars = (res + mid.charAt(0)).toCharArray();
            Arrays.sort(resChars);
            res = new String(resChars);
            return res + new StringBuilder(res).reverse();
        }

        return res + mid + new StringBuilder(res).reverse();
    }
}
