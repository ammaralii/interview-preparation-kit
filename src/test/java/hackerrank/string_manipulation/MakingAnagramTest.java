package hackerrank.string_manipulation;

import org.junit.Assert;
import org.junit.Test;

public class MakingAnagramTest {
    @Test
    public void success_makeAnagram_test_0() {
        Assert.assertEquals(MakingAnagram.makeAnagram("cde","abc"), 4);
    }

    @Test
    public void success_makeAnagram_test_1() {
        Assert.assertEquals(MakingAnagram.makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"), 30);
    }

    @Test
    public void success_makeAnagram_test_2() {
        Assert.assertEquals(MakingAnagram.makeAnagram("showman","woman"), 2);
    }
}
