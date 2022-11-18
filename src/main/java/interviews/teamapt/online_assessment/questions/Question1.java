package interviews.teamapt.online_assessment.questions;

public class Question1 {
    public static int balancedSum(int[] arr) {
        return solution2(arr);
    }

    //This is how I solved it
    private static int solution1(int[] arr){
        int leftptr = 0;
        int rightptr = arr.length - 1;
        int left_sum = arr[leftptr];
        int right_sum = arr[rightptr];
        while (rightptr - leftptr != 2) {
            if (left_sum <= right_sum) {
                leftptr++;
                left_sum = left_sum + arr[leftptr];
            } else {
                rightptr--;
                right_sum = right_sum + arr[rightptr];
            }
        }
        if (left_sum == right_sum) {
            return (leftptr + 1);
        } else {
            return -1;
        }
    }

    //Best Algorithm
    private static int solution2(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = 1; i < arr.length -1; i++) {
            if ((totalSum - arr[i])%2==0){
                return i;
            }
        }
        return -1;
    }
}
