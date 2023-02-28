package interviews.aurora_solutions.coding_challenge_coderbyte.question;

import org.junit.Test;

import static interviews.aurora_solutions.coding_challenge_coderbyte.question.Question1.StringChallenge;

public class Question1Test {
    @Test
    public void success_StringChallenge_test_cases() {
        // Test case 1
        String input1 = "2a3b5 w1o2rl3d g1gg92";
        String expectedOutput1 = "true";
        String output1 = StringChallenge(input1);
        assert output1.equals(expectedOutput1) : "Test Case 1 Failed";

        // Test case 2
        String input2 = "21aa3a ggg4g4g6ggg";
        String expectedOutput2 = "false";
        String output2 = StringChallenge(input2);
        assert output2.equals(expectedOutput2) : "Test Case 2 Failed";
    }
}
