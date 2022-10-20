package hackerrank.sorting;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    public void success_countSwaps_test_0() {
        BubbleSort.countSwaps(Arrays.asList(1,2,3));
    }

    @Test
    public void success_countSwaps_test_1() {
        BubbleSort.countSwaps(Arrays.asList(3,2,1));
    }

    @Test
    public void success_countSwaps_test_2() {
        BubbleSort.countSwaps(Arrays.asList(4,2,3,1));
    }
}
