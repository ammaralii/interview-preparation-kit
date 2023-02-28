package interviews.aurora_solutions.coding_challenge_coderbyte.question;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static String StringChallenge(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Set<Integer> digits = new HashSet<Integer>();
            int adjacentCount = 0;

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (Character.isDigit(ch)) {
                    int digit = Character.getNumericValue(ch);
                    digits.add(digit);
                    if (j > 0 && Character.isDigit(word.charAt(j-1)) && Math.abs(Character.getNumericValue(word.charAt(j-1)) - digit) == 1) {
                        adjacentCount++;
                    }
                }
            }

            if (digits.size() != 3 || adjacentCount == 3) {
                return "false";
            }
        }

        return "true";
    }

}
