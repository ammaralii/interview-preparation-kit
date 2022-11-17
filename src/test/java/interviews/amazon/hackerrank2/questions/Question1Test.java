package interviews.amazon.hackerrank2.questions;

import org.junit.Assert;
import org.junit.Test;

public class Question1Test {
    @Test
    public void success_maxSetSize_test_0() {
        Assert.assertEquals(Question1.maxSetSize(new int[]{3,9,4,2,16}), 3);
    }
}
