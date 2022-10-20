package interviews.amazon.questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Question1Test {
    @Test
    public void success_countDecreasingRatings_test_0() {
        Assert.assertTrue(interviews.amazon.questions.Question1.countDecreasingRatings(Arrays.asList(2,1,3)).equals(4));
    }

    @Test
    public void success_countDecreasingRatings_test_1() {
        Assert.assertTrue(interviews.amazon.questions.Question1.countDecreasingRatings(Arrays.asList(4,3,5,4,3)).equals(9));
    }
}
