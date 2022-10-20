package hackerrank.dictionaries_and_hashmaps;

import java.util.*;

public class SherLockAndAnagrams {
    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    //abcd
    //abc
    //ab,bc
    //a,b,b,c
    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> anagrams = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) { // O(|s|)
            System.out.println("Index is: " + i);
            for (int j = 0; j < s.length() - i; ++j) { // O(|s|)
                System.out.println(String.format("Index i is: %d, Index j is: %d", i, j));
                char[] substr = s.substring(j, j + i + 1).toCharArray();
                Arrays.sort(substr); // O(|s| log|s|)
                System.out.println(substr);
                String anagram = new String(substr);
                anagrams.put(anagram, anagrams.getOrDefault(anagram, 0) + 1);
            }
        }

        int total = 0;
        for (int v : anagrams.values()) { // O(|k|)
            if (v > 1) {
                System.out.println(v);
                total += combs(v);
            }
        }
        return total;
    }

    public static int combs(int n) {
        return n * (n - 1) / 2;
    }
}
