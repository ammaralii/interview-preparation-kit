package interviews.remotebase.coding_challenge_hackerrank.questions;

import interviews.remotebase.coding_challenge_hackerrank.question.Question1;
import org.junit.Assert;
import org.junit.Test;

public class Question1Test {
    @Test
    public void success_containingAnyCombination_test_0() {
        Assert.assertArrayEquals(Question1.rearrange(new int[]{21,34,5,7,9}), new int[]{9,21,5,34,7});
    }

    @Test
    public void success_containingAnyCombination_test_1() {
        Assert.assertArrayEquals(Question1.rearrange(new int[]{1,2,3,4}), new int[]{2,3,1,4});
    }
}
