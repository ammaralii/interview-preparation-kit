package hackerrank.greedy_algorithms;

import java.util.Stack;

public class ReverseShuffleMerge {
    public static String reverseShuffleMerge(String s) {
        int[] addCount = new int[26];
        int[] skipCount;
        Stack<Character> characters = new Stack<>();
        String result = "";

        char[] sChar = s.toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            addCount[sChar[i] - 'a']++;
        }

        for (int i = 0; i < addCount.length; i++) {
            addCount[i] /= 2;
        }

        skipCount = addCount.clone();

        for (int i = sChar.length - 1; i >= 0; i--) {
            while (!characters.empty() && characters.peek() > sChar[i] && addCount[sChar[i] - 'a'] > 0 && skipCount[characters.peek() - 'a'] > 0) {
                char c = characters.pop();
                addCount[c - 'a']++;
                skipCount[c - 'a']--;
            }

            if (addCount[sChar[i] - 'a'] > 0) {
                characters.push(sChar[i]);
                addCount[sChar[i] - 'a']--;
            } else {
                skipCount[sChar[i] - 'a']--;
            }
        }

        while (!characters.empty()) {
            result = characters.pop() + result;
        }
        return result;
    }
}
