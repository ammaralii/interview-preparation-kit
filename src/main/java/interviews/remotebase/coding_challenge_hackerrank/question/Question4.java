package interviews.remotebase.coding_challenge_hackerrank.question;

import java.util.LinkedHashMap;
import java.util.Map;

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
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : s1.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        String ans = "";
        for (char c : count.keySet()) {
            if (count.get(c) % 2 == 0) {
                ans += new String(new char[count.get(c) / 2]).replace("\0", c + "");
                count.put(c, 0);
            } else {
                ans += new String(new char[(count.get(c) - 1) / 2]).replace("\0", c + "");
                count.put(c, 1);
            }
        }
        char middle_char = ' ';
        for (char c : count.keySet()) {
            if (count.get(c) == 1) {
                middle_char = c;
                break;
            }
        }
        ans = ans + middle_char + new StringBuilder(ans).reverse();
        return ans;
    }
}
