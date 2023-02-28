package hackerrank.arrays;

import java.util.*;

public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        return arrayManipulationUsingMap(n, queries);
    }

    public static long arrayManipulationUsingForLoop(int n, List<List<Integer>> queries) {
        System.out.println("Size is: " + n);
        System.out.println(queries);
        int maxValue = Integer.MIN_VALUE;
        int arr[] = new int[n];
        Arrays.fill(arr, 0, n, 0);
        MinimumSwapsTwo.printArray(arr);
        for (List<Integer> query :
                queries) {
            Integer fromIndex = query.get(0);
            Integer toIndex = query.get(1);
            Integer value = query.get(2);
            for (int i = fromIndex - 1; i < toIndex; i++) {
                arr[i] += value;
                if (arr[i] > maxValue) {
                    maxValue = arr[i];
                }
            }
            MinimumSwapsTwo.printArray(arr);
        }
        return maxValue;
    }

    public static long arrayManipulationUsingMap(int n, List<List<Integer>> queries) {
        System.out.println("Size is: " + n);
        System.out.println(queries);
        Map<Long, Long> map = new HashMap<>();

        for (List<Integer> query : queries) {
            Long fromIndex = Long.valueOf(query.get(0));
            Long toIndex = Long.valueOf(query.get(1));
            Long value = Long.valueOf(query.get(2));

            map.put(fromIndex, (map.containsKey(fromIndex) ? map.get(fromIndex) : 0) + value);
            map.put(toIndex + 1, (map.containsKey(toIndex + 1) ? map.get(toIndex + 1) : 0) - value);
            System.out.println(map);
        }

        long maxValue = 0;
        long value = 0;
        for (long i = 0; i < n; i++) {
            value += (map.containsKey(i + 1) ? map.get(i + 1) : 0);
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public ArrayList<String> fullJustify(ArrayList<String> words, int L) {
        ArrayList<String> lines = new ArrayList<>();
        int index = 0;
        while (index < words.size()) {
            int count = words.get(index).length();
            int last = index + 1;
            while (last < words.size()) {
                if (words.get(last).length() + count + 1 > L) break;
                count += words.get(last).length() + 1;
                last++;
            }

            StringBuilder builder = new StringBuilder();
            int diff = last - index - 1;
            if (last != words.size() && diff != 0) {
                for (int i = index; i < last; i++) {
                    builder.append(words.get(i));
                    if (i < last - 1) {
                        for (int j = 0; j < (L - count) / diff; j++) {
                            builder.append(" ");
                        }
                        if (i - index < (L - count) % diff) {
                            builder.append(" ");
                        }
                    }
                }
            } else {
                for (int i = index; i < last; i++) {
                    builder.append(words.get(i) + " ");
                }
                builder.deleteCharAt(builder.length() - 1);
            }
            lines.add(builder.toString());
            index = last;
        }
        return lines;
    }
}
