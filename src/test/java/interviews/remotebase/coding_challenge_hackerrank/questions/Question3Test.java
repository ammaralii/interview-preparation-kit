package interviews.remotebase.coding_challenge_hackerrank.questions;

import interviews.remotebase.coding_challenge_hackerrank.question.Question3;
import org.junit.Assert;
import org.junit.Test;

public class Question3Test {
    @Test
    public void success_getString_example_0() {
        Assert.assertEquals(Question3.getString("bbcacad"), "aabcbcd");
    }

    @Test
    public void success_getString_test_0() {
        Assert.assertEquals(Question3.getString("bdea"), "abde");
    }
    @Test
    public void success_getString_test_1() {
        Assert.assertEquals(Question3.getString("abbbe"), "abbbe");
    }
    @Test
    public void success_getString_test_2() {
        Assert.assertEquals(Question3.getString("tsraa"), "arstt");
    }
}
