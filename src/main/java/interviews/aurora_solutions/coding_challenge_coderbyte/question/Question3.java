package interviews.aurora_solutions.coding_challenge_coderbyte.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Question3 {
    public static String ArrayChallenge(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.empty() && stack.peek() > arr[i]) {
                stack.pop();
            }

            if (!stack.empty()) {
                result.add(stack.peek());
            } else {
                result.add(-1);
            }

            stack.push(arr[i]);
        }

        return result.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
}
