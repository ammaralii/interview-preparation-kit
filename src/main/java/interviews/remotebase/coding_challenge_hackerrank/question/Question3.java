package interviews.remotebase.coding_challenge_hackerrank.question;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Question3 {
    /**
     * @param s
     * @return string: the lexicographically smallest string s can be changed to
     */
    public static String getString(String s) {
        char[] sChar = s.toCharArray();
        int str_len = s.length();
        char[] res = new char[str_len];
        Map<Character, List<Integer>> charDict = new LinkedHashMap<>();
        Map<Character, List<Integer>> charDictOld = new LinkedHashMap<>();

        for (int i = 0; i < sChar.length; i++) {
            char ch = sChar[i];
            if (!charDict.containsKey(ch)) {
                charDict.put(ch, new ArrayList<>());
                charDict.get(ch).add(i);
                charDictOld.put(ch, new ArrayList<>());
                charDictOld.get(ch).add(i);
            } else {
                charDict.get(ch).add(i);
                charDictOld.get(ch).add(i);
            }
        }

        List<Character> keys = new ArrayList<>(charDict.keySet());
        Collections.sort(keys);

        List<List<Integer>> dictValue = new ArrayList<>();
        for (char i : charDictOld.keySet()) {
            dictValue.add(charDictOld.get(i));
        }

        int dictIndex = 0;
        for (char i : keys) {
            charDict.put(i, dictValue.get(dictIndex));
            dictIndex++;
        }

        for (char i : keys) {
            for (int index : charDict.get(i)) {
                res[index] = i;
            }
        }

        return new String(res);
    }
}
