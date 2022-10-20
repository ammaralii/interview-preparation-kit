package hackerrank.dictionaries_and_hashmaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CountTripletsTest {
    @Test
    public void success_countTriplets_example() {
        Assert.assertEquals(CountTriplets.countTriplets(Arrays.asList(1l,2l,2l,4l), 2), 2);
    }

    @Test
    public void success_checkMagazineUsingMap_test_0() {
        Assert.assertEquals(CountTriplets.countTriplets(Arrays.asList(1l, 3l, 9l, 9l, 27l, 81l), 3), 6);
    }

    @Test
    public void success_checkMagazineUsingMap_test_1() {
        Assert.assertEquals(CountTriplets.countTriplets(Arrays.asList(1l, 5l, 5l, 25l, 125l), 5), 4);
    }
}
