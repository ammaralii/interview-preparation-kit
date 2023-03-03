package interviews.avenue_code.coding_challenge_hackerrank.questions;

import org.junit.Test;

import static interviews.avenue_code.coding_challenge_hackerrank.questions.Section2Question2.bestInGenre;

public class Section2Question2Test {
    @Test
    public void success_StringChallenge_test_cases() {
        // Test case 1
//        String input1 = "Action";
//        String expectedOutput1 = "Game of Thrones";
//        String output1 = bestInGenre(input1);
//        assert output1.equals(expectedOutput1) : "Test Case 1 Failed";

        // Test case 2
        String input2 = "Animation";
        String expectedOutput2 = "Avatar: The Last Airbender";
        String output2 = bestInGenre(input2);
        assert output2.equals(expectedOutput2) : "Test Case 2 Failed";
    }
}
