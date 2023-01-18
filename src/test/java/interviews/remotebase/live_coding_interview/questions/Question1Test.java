package interviews.remotebase.live_coding_interview.questions;

import org.junit.Test;
import utils.CaptureOutput;

import static org.junit.Assert.assertEquals;

public class Question1Test {
    @Test
    public void success_search_test_0() {
        String pattern = "glx";
        String text = "abcbcglx";
        String exceptedOutput = "Found pattern at index 5\n";
        String actual = CaptureOutput.captureStandardOutput(() -> Question1.search(pattern, text));
        assertEquals(exceptedOutput, actual);
    }

    @Test
    public void success_search_test_1() {
        String pattern = "xyz";
        String text = "abcabcxyzabcxxyzyxyz";
        String exceptedOutput = "Found pattern at index 6\n" +
                "Found pattern at index 13\n" +
                "Found pattern at index 17\n";
        String actual = CaptureOutput.captureStandardOutput(() -> Question1.search(pattern, text));
        assertEquals(exceptedOutput, actual);
    }

    @Test
    public void success_search_test_2() {
        String pattern = "Magic";
        String text = "hello it's me Magic. Do you know what Magic is in this repo";
        String exceptedOutput = "Found pattern at index 14\n" +
                "Found pattern at index 38\n";
        String actual = CaptureOutput.captureStandardOutput(() -> Question1.search(pattern, text));
        assertEquals(exceptedOutput, actual);
    }

    @Test
    public void failure_search_test_0() {
        String pattern = "xyz";
        String text = "abcdef ghijkl";
        String exceptedOutput = "No Pattern Found\n";
        String actual = CaptureOutput.captureStandardOutput(() -> Question1.search(pattern, text));
        assertEquals(exceptedOutput, actual);
    }
}
