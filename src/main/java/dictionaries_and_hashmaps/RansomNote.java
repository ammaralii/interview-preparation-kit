package dictionaries_and_hashmaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        System.out.println(checkMagazineUsingMap(magazine, note));
    }

    public static String checkMagazineUsingMap(List<String> magazine, List<String> note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        for (String string: magazine) {
            magazineMap.put(string, magazineMap.getOrDefault(string, 0) + 1);
        }
        for (String string : note) {
            if(magazineMap.containsKey(string)){
                Integer frequency = magazineMap.get(string);
                if (frequency > 1){
                    magazineMap.put(string, frequency - 1);
                } else {
                    magazineMap.remove(string);
                }
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
