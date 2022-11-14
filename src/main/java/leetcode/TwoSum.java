package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer,Integer> numsMap = new HashMap<>();

        for(int i=0;i<n;i++){
            if(numsMap.containsKey(target-nums[i])){
                int[] result = {numsMap.get(target-nums[i]), i};
                return result;
            } else {
                numsMap.put(nums[i],i);
            }
        }
        return new int[2];
    }
}
