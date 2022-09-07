package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MergeSortCountingInversionsTest {
    @Test
    public void success_countInversions_test_0() {
        Assert.assertEquals(MergeSortCountingInversions.countInversions(Arrays.asList(1,1,1,2,2)), 0);
    }

    @Test
    public void success_countInversions_test_1() {
        Assert.assertEquals(MergeSortCountingInversions.countInversions(Arrays.asList(2,1,3,1,2)), 4);
    }

    @Test
    public void success_countInversionsOptimized_test_0() {
        Assert.assertEquals(MergeSortCountingInversions.countInversionsOptimized(Arrays.asList(1,1,1,2,2)), 0);
    }

    @Test
    public void success_countInversionsOptimized_test_1() {
        Assert.assertEquals(MergeSortCountingInversions.countInversionsOptimized(Arrays.asList(2,1,3,1,2)), 4);
    }
}
