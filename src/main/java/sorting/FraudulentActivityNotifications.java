package sorting;

import arrays.MinimumSwapsTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FraudulentActivityNotifications {
    static LinkedList<Integer> list;

    public static int activityNotifications(List<Integer> expenditure, int d) {
        return activityNotificationsOptimized(expenditure, d);
    }

    private static int activityNotificationsNotOptimized(List<Integer> expenditure, int d) {
        list = new LinkedList<>();
        System.out.println("Actual Array is: " + expenditure);
        Integer notice = 0;
        for (int i = d; i < expenditure.size(); i++) {
            float median = findMedian(expenditure, d, i);
            System.out.println("Median is: " + median);
            if (expenditure.get(i) >= (median * 2)) {
                notice++;
            }
        }
        return notice;
    }

    private static float findMedian(List<Integer> expenditure, int d, int index) {
        if (index > d) {
            list.pop();
            list.add(expenditure.get(index));
        } else {
            list.addAll(expenditure.subList(0, d));
        }
//        Map<Integer, Integer> expenditureCopy =new HashMap<>();
//        for (int i = 0;i<list.size();i++){
//            expenditureCopy.put(i,list.get(i));
//        }
        List<Integer> expenditureCopy = new ArrayList<>();
        expenditureCopy.addAll(list);
        System.out.println(expenditureCopy);
        Collections.sort(expenditureCopy);
        if (d % 2 == 0) {
            int z = d / 2;
            int e = expenditureCopy.get(z);
            int q = expenditureCopy.get(z - 1);

            float ans = (e + q) / 2f;
            return ans;
        }

        // If length if array is odd
        else {
            int z = Math.round(d / 2);
            return expenditureCopy.get(z);
        }
    }

    private static int activityNotificationsOptimized(List<Integer> expenditures, int d) {
        int[] counts = new int[201];
        for (int i = 0; i < d; i++) {
            counts[expenditures.get(i)]++;
        }

        int result = 0;
        for (int i = d; i < expenditures.size(); i++) {
            int lower = 0;
            int leftNum = 0;
            while ((leftNum + counts[lower]) * 2 <= d) {
                leftNum += counts[lower];
                lower++;
            }

            int upper = counts.length - 1;
            int rightNum = 0;
            while ((rightNum + counts[upper]) * 2 <= d) {
                rightNum += counts[upper];
                upper--;
            }

            if (expenditures.get(i) >= lower + upper) {
                result++;
            }

            counts[expenditures.get(i - d)]--;
            counts[expenditures.get(i)]++;
            MinimumSwapsTwo.printArray(counts);
        }
        return result;
    }
}
