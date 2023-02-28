package interviews.aurora_solutions.coding_challenge_coderbyte.question;

import org.junit.Test;

import static interviews.aurora_solutions.coding_challenge_coderbyte.question.Question4.ArrayChallenge;

public class Question4Test {
    @Test
    public void success_ArrayChallenge_test_cases() {
        // Test case 1
        int[] input1 = {5, 7, 16, 1, 2};
        String expectedOutput1 = "false";
        String actualOutput1 = ArrayChallenge(input1);
        assert actualOutput1.equals(expectedOutput1) : "Test Case 1 Failed";

        // Test case 2
        int[] input2 = {3, 5, -1, 8, 12};
        String expectedOutput2 = "true";
        String actualOutput2 = ArrayChallenge(input2);
        assert actualOutput2.equals(expectedOutput2) : "Test Case 2 Failed";

    }
}
