package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MajorityElementTest {
    @Test
    public void success_majorityElement_test_0() {
        Assert.assertTrue(MajorityElement.majorityElement(Arrays.asList(2,1,2)) == 2);
    }

    @Test
    public void success_majorityElement_test_1() {
        Assert.assertTrue(MajorityElement.majorityElement(Arrays.asList(2,1,2,1,3,4,4,3,1)) == 1);
    }
}
