package dictionaries_and_hashmaps;

import org.junit.Assert;
import org.junit.Test;

public class SherLockAndAnagramsTest {
    @Test
    public void success_sherlockAndAnagrams_example_0() {
        Assert.assertEquals(SherLockAndAnagrams.sherlockAndAnagrams("mom"), 2);
    }

    @Test
    public void success_sherlockAndAnagrams_test_0() {
        Assert.assertEquals(SherLockAndAnagrams.sherlockAndAnagrams("abba"), 4);
    }

    @Test
    public void success_sherlockAndAnagrams_test_1() {
        Assert.assertEquals(SherLockAndAnagrams.sherlockAndAnagrams("abcd"), 0);
    }

    @Test
    public void success_sherlockAndAnagrams_test_2() {
        Assert.assertEquals(SherLockAndAnagrams.sherlockAndAnagrams("kkkk"), 10);
    }
}
