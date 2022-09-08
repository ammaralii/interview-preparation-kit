package interviews.glovo.questions;

import org.junit.Assert;
import org.junit.Test;

public class Question1Test {
    @Test
    public void success_isAnagram_test_0() {
        Assert.assertEquals(Question1.isAnagram("ABCD", "DABC"),true);
    }

    @Test
    public void success_isAnagram_test_1() {
        Assert.assertEquals(Question1.isAnagram("AABB", "BBAA"),true);
    }

    @Test
    public void failure_isAnagram_test_2() {
        Assert.assertEquals(Question1.isAnagram("AAAB", "AABB"),false);
    }
}
