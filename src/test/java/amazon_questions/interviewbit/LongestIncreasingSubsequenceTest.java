package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(LongestIncreasingSubsequence.lis(Arrays.asList(10, 22, 9, 33, 21, 50, 41, 60)) == 5);
    }
}
