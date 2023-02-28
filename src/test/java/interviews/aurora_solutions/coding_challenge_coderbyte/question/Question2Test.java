package interviews.aurora_solutions.coding_challenge_coderbyte.question;

import org.junit.Test;

import static interviews.aurora_solutions.coding_challenge_coderbyte.question.Question2.StringChallenge;

public class Question2Test {
    @Test
    public void success_StringChallenge_test_cases() {
        String input1 = "99946";
        String expectedOutput1 = "9-9-946";
        String output1 = StringChallenge(input1);
        assert output1.equals(expectedOutput1) : "Test Case 1 Failed";

        String input2 = "56730";
        String expectedOutput2 = "567-30";
        String output2 = StringChallenge(input2);
        assert output2.equals(expectedOutput2) : "Test Case 2 Failed";
    }
}
