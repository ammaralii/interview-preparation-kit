package dictionaries_and_hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {
    //- 1 x : Insert x in your data structure.
    //- 2 y : Delete one occurence of y from your data structure, if present.
    //- 3 z : Check if any integer is present whose frequency is exactly . If yes, print 1 else 0.
    public static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> queriesValuesMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (List<Integer> query : queries) {
            Integer queryKey = query.get(0);
            Integer queryValue = query.get(1);
            if (queryKey.equals(1)){
                Integer value = queriesValuesMap.getOrDefault(queryValue, 0);
                queriesValuesMap.put(queryValue, value + 1);
                freqMap.put(value, freqMap.getOrDefault(value, 0) - 1);
                freqMap.put(value + 1, freqMap.getOrDefault(value + 1, 0) + 1);
            } else if (queryKey.equals(2)){
                Integer value = queriesValuesMap.getOrDefault(queryValue, 0);
                if (value>1){
                    queriesValuesMap.put(queryValue, value - 1);
                    freqMap.put(value, freqMap.getOrDefault(value, 0) - 1);
                    freqMap.put(value - 1, freqMap.getOrDefault(value - 1, 0) + 1);
                } else {
                    queriesValuesMap.remove(queryValue);
                    freqMap.put(value, freqMap.getOrDefault(value, 0) - 1);
                }
            } else if (queryKey.equals(3)){
                Integer value = freqMap.getOrDefault(queryValue, 0);
                if (value > 0){
                    result.add(1);
                } else {
                    result.add(0);
                }
                //Optimized using Freq map addition
//                if (queriesValuesMap.size()>0) {
//                    boolean exists = queriesValuesMap.entrySet().stream().anyMatch(d->d.getValue().equals(queryValue));
//                    if (exists) {
//                        result.add(1);
//                    } else {
//                        result.add(0);
//                    }
//                } else {
//                    result.add(0);
//                }
            }
        }
        return result;
    }
}
