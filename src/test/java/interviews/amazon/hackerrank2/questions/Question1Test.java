package interviews.amazon.hackerrank2.questions;

import org.junit.Assert;
import org.junit.Test;

public class Question1Test {
    @Test
    public void success_maxSetSize_test_0() {
        Assert.assertEquals(Question1.maxSetSize(new int[]{3, 9, 4, 2, 16}), 3);
    }

    @Test
    public void success_maxSetSize_test_1() {
        Assert.assertEquals(Question1.maxSetSize(new int[]{2, 4, 5, 25, 26, 125, 16, 625, 390625}), 4);
    }
}
