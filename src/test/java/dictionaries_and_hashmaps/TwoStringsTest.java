package dictionaries_and_hashmaps;

import org.junit.Assert;
import org.junit.Test;

public class TwoStringsTest {
    @Test
    public void success_twoStrings_example_0() {
        Assert.assertEquals(TwoStrings.twoStrings("and","art"), "YES");
    }

    @Test
    public void success_twoStrings_example_1() {
        Assert.assertEquals(TwoStrings.twoStrings("be","cat"), "NO");
    }

    @Test
    public void success_twoStrings_test_0() {
        Assert.assertEquals(TwoStrings.twoStrings("wouldyoulikefries","abcabcabcabcabcabc"), "NO");
    }

    @Test
    public void success_twoStrings_test_1() {
        Assert.assertEquals(TwoStrings.twoStrings("aardvark","apple"), "YES");
    }
}
