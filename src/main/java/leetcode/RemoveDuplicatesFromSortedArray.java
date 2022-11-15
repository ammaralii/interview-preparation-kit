package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
