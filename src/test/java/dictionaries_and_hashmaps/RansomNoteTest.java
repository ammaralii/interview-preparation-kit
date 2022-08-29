package dictionaries_and_hashmaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RansomNoteTest {
    @Test
    public void success_checkMagazineUsingMap_example() {
        List<String> magazine = Arrays.asList("give", "me", "one", "grand", "today", "night");
        List<String> note = Arrays.asList("give", "one", "grand", "today");
        Assert.assertEquals(RansomNote.checkMagazineUsingMap(magazine, note), "Yes");
    }

    @Test
    public void success_checkMagazineUsingMap_test_0() {
        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        List<String> note = Arrays.asList("two", "times", "two", "is", "four");
        Assert.assertEquals(RansomNote.checkMagazineUsingMap(magazine, note), "No");
    }

    @Test
    public void success_checkMagazineUsingMap_test_1() {
        List<String> magazine = Arrays.asList("ive", "got", "a", "lovely", "bunch", "of", "coconuts");
        List<String> note = Arrays.asList("ive", "got", "some", "coconuts");
        Assert.assertEquals(RansomNote.checkMagazineUsingMap(magazine, note), "No");
    }
}
