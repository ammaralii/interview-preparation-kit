package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

public class WaysToDecodeTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(WaysToDecode.find("12") == 2);
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(WaysToDecode.find("1234") == 3);
    }
}
