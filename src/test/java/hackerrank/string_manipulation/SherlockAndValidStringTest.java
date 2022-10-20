package hackerrank.string_manipulation;

import org.junit.Assert;
import org.junit.Test;

public class SherlockAndValidStringTest {
    @Test
    public void success_isValid_test_0() {
        Assert.assertEquals(SherlockAndValidString.isValid("aabbcd"), "NO");
    }

    @Test
    public void success_isValid_test_1() {
        Assert.assertEquals(SherlockAndValidString.isValid("aabbccddeefghi"), "NO");
    }

    @Test
    public void success_isValid_test_2() {
        Assert.assertEquals(SherlockAndValidString.isValid("abcdefghhgfedecba"), "YES");
    }
}
