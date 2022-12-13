package interviews.remotebase.coding_challenge_hackerrank.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximizeTheValue {
    public static int[] rearrange(int[] arr){
        // Sorting the array

        Arrays.sort(arr);

        // Taking the size of the array in an arraySize variable

        int arraySize = arr.length;

        // If the size of the array is less than

        // or equals to 2 then we return

        // because we just multiply the first and second element

        if (arraySize <= 2) {

            return arr;

        }

        // Declaring a vector to store answers

        List<Integer> ans = new ArrayList<>();

        int k = 0, j = 0;

        // If the size of the array is even then the value of j

        // becomes array size minus one divided by 2

        // else j becomes array size divided by 2

        if (arraySize % 2 == 0) {

            j = (arraySize - 1) / 2;

        } else {

            j = arraySize / 2;

        }

        // First we push back the jth element into the answer vector

        ans.add(arr[j]);

        j++;

        ans.add(arr[j]);

        j++;

        for (int i = 2; i < arraySize; i++) {

            // If it is even then we push back the kth element

            // else we push back jth element

            if (i % 2 == 0) {

                ans.add(arr[k]);

                k++;

            } else {

                ans.add(arr[j]);

                j++;

            }

        }

        // Return
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
