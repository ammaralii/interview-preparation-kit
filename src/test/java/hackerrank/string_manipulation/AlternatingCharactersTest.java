package hackerrank.string_manipulation;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingCharactersTest {
    @Test
    public void success_alternatingCharacters_test_0() {
        Assert.assertEquals(AlternatingCharacters.alternatingCharacters("AAAA"), 3);
    }

    @Test
    public void success_alternatingCharacters_test_1() {
        Assert.assertEquals(AlternatingCharacters.alternatingCharacters("AAABBBAABB"), 6);
    }

    @Test
    public void success_alternatingCharacters_test_2() {
        Assert.assertEquals(AlternatingCharacters.alternatingCharacters("ABBABBAA"), 3);
    }
}
