package interviews.avenue_code.coding_challenge_hackerrank.questions;

import org.junit.Test;

import static interviews.avenue_code.coding_challenge_hackerrank.questions.Section2Question1.bestUniversityByCountry;

public class Section2Question1Test {
    @Test
    public void success_StringChallenge_test_cases() {
        // Test case 1
        String input1 = "India";
        String expectedOutput1 = "Indian Institute of Technology Bombay (IITB)";
        String output1 = bestUniversityByCountry(input1);
        assert output1.equals(expectedOutput1) : "Test Case 1 Failed";

        // Test case 2
        String input2 = "United Kingdom";
        String expectedOutput2 = "University of Oxford";
        String output2 = bestUniversityByCountry(input2);
        assert output2.equals(expectedOutput2) : "Test Case 2 Failed";

        // Test case 3
        String input3 = "North Korea";
        String expectedOutput3 = "";
        String output3 = bestUniversityByCountry(input3);
        assert output3.equals(expectedOutput3) : "Test Case 3 Failed";
    }
}
