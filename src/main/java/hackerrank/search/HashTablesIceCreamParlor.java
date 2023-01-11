package hackerrank.search;

import java.util.HashMap;
import java.util.List;

public class HashTablesIceCreamParlor {
    public static void whatFlavors(List<Integer> cost, int money) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.size(); i++) {
            int complement = money - cost.get(i);
            if (map.containsKey(complement)) {
                System.out.println((map.get(complement) + 1) + " " + (i + 1));
                return;
            }
            map.put(cost.get(i), i);
        }
        System.out.println("Error: no two flavors add up to the total cost.");
    }
}