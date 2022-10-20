package hackerrank.dictionaries_and_hashmaps;

import java.util.LinkedHashSet;
import java.util.Set;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        Set<Character> set = new LinkedHashSet<>();
        s1.chars().forEach(e -> set.add((char) e));
        for (char c: set){
            if(s1.indexOf(c)>-1 && s2.indexOf(c)>-1)
                return "YES";
        }
        return "NO";
    }
}
