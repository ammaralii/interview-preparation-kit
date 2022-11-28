package hackerrank.greedy_algorithms;

import org.junit.Assert;
import org.junit.Test;

public class ReverseShuffleMergeTest {
    @Test
    public void success_reverseShuffleMerge_test_0() {
        Assert.assertEquals(ReverseShuffleMerge.reverseShuffleMerge("eggegg"), "egg");
    }

    @Test
    public void success_reverseShuffleMerge_test_1() {
        Assert.assertEquals(ReverseShuffleMerge.reverseShuffleMerge("abcdefgabcdefg"), "agfedcb");
    }

    @Test
    public void success_reverseShuffleMerge_test_2() {
        Assert.assertEquals(ReverseShuffleMerge.reverseShuffleMerge("aeiouuoiea"), "aeiou");
    }
}
