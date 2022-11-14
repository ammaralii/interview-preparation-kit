package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    @Test
    public void success_find_test_0() {
        Assert.assertEquals(LongestCommonPrefix.find(new String[]{"flower","flow","flight"}), "fl");
    }
}
