package string_manipulation;

import org.junit.Assert;
import org.junit.Test;

public class SpecialStringAgainTest {
    @Test
    public void success_substrCount_test_0() {
        Assert.assertEquals(SpecialStringAgain.substrCount(5, "asasd"), 7);
    }

    @Test
    public void success_substrCount_test_1() {
        Assert.assertEquals(SpecialStringAgain.substrCount(7, "abcbaba"), 10);
    }

    @Test
    public void success_substrCount_test_2() {
        Assert.assertEquals(SpecialStringAgain.substrCount(4, "aaaa"), 10);
    }
}
