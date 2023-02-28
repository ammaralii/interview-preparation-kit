package interviews.aurora_solutions.coding_challenge_coderbyte.question;

import org.junit.Test;

import static interviews.aurora_solutions.coding_challenge_coderbyte.question.Question3.ArrayChallenge;

public class Question3Test {
    @Test
    public void success_ArrayChallenge_test_cases() {
        int[] input1 = {5, 3, 1, 9, 7, 3, 4, 1};
        String expectedOutput1 = "-1 -1 -1 1 1 1 3 1";
        String actualOutput1 = ArrayChallenge(input1);
        assert actualOutput1.equals(expectedOutput1) : "Test Case 1 Failed";

        int[] input2 = {2, 4, 5, 1, 7};
        String expectedOutput2 = "-1 2 4 -1 1";
        String actualOutput2 = ArrayChallenge(input2);
        assert actualOutput2.equals(expectedOutput2) : "Test Case 2 Failed";

    }
}
