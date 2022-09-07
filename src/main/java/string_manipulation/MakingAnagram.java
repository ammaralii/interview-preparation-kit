package string_manipulation;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagram {
    public static int makeAnagram(String a, String b) {
        Integer count = 0;
        Map<String, Integer> aMap = new HashMap<>();
        for (char s : a.toCharArray()) {
            aMap.put(String.valueOf(s), aMap.getOrDefault(String.valueOf(s), 0) + 1);
        }
        for (char s : b.toCharArray()) {
            if (aMap.containsKey(String.valueOf(s))) {
                aMap.put(String.valueOf(s), aMap.get(String.valueOf(s)) - 1);
            } else {
                count++;
            }
        }
        for (Map.Entry<String, Integer> entry : aMap.entrySet()) {
            Integer value = entry.getValue();
            if (value < 0) {
                value *= -1;
            }
            count += value;
        }
        return count;
    }
}
