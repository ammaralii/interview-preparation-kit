package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSumPathInMatrixTest {

    @Test
    public void success_find_test_0() {
        int [][]grid = {{1,3,2},{4,3,1},{5,6,1}};
        Assert.assertEquals(MinimumSumPathInMatrix.find(grid), 8);
    }
}
