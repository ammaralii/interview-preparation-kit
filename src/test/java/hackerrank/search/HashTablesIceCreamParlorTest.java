package hackerrank.search;

import org.junit.Test;
import utils.CaptureOutput;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HashTablesIceCreamParlorTest {
    @Test
    public void success_whatFlavors_test_0() {
        assertEquals("1 4\n", CaptureOutput.captureStandardOutput(() -> HashTablesIceCreamParlor.whatFlavors(Arrays.asList(1, 4, 5, 3, 2), 4)));
    }

    @Test
    public void success_whatFlavors_test_1() {
        assertEquals("1 2\n", CaptureOutput.captureStandardOutput(() -> HashTablesIceCreamParlor.whatFlavors(Arrays.asList(2, 2, 4, 3), 4)));
    }

    @Test
    public void success_whatFlavors_test_2() {
        assertEquals("1 3\n", CaptureOutput.captureStandardOutput(() -> HashTablesIceCreamParlor.whatFlavors(Arrays.asList(7, 2, 5, 4, 11), 12)));
    }

    @Test
    public void failure_whatFlavors_test_0() {
        assertEquals("Error: no two flavors add up to the total cost.\n", CaptureOutput.captureStandardOutput(() -> HashTablesIceCreamParlor.whatFlavors(Arrays.asList(2,2,5), 8)));
    }
}
