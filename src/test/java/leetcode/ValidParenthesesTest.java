package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void success_isValid_test_0() {
        Assert.assertEquals(ValidParentheses.isValid("()"),true);
    }

    @Test
    public void success_isValid_test_1() {
        Assert.assertEquals(ValidParentheses.isValid("()[]{}"),true);
    }

    @Test
    public void success_isValid_test_2() {
        Assert.assertEquals(ValidParentheses.isValid("(]"),false);
    }

    @Test
    public void success_isValid_test_3() {
        Assert.assertEquals(ValidParentheses.isValid("([{}])"),true);
    }
}
