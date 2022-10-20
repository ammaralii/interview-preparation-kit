package hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArrayDSTest {
    @Test
    public void success_jumpingOnClouds_example() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(-9,-9,-9,1,1,1));
        arr.add(Arrays.asList(0,-9,0,4,3,2));
        arr.add(Arrays.asList(-9,-9,-9,1,2,3));
        arr.add(Arrays.asList(0,0,8,6,6,0));
        arr.add(Arrays.asList(0,0,0,-2,0,0));
        arr.add(Arrays.asList(0,0,1,2,4,0));
        Assert.assertEquals(TwoDArrayDS.hourglassSum(arr), 28);
    }

    @Test
    public void success_jumpingOnClouds_test_0() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,1,0,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,0,2,4,4,0));
        arr.add(Arrays.asList(0,0,0,2,0,0));
        arr.add(Arrays.asList(0,0,1,2,4,0));
        Assert.assertEquals(TwoDArrayDS.hourglassSum(arr), 19);
    }

    @Test
    public void success_jumpingOnClouds_test_1() {
        Assert.assertEquals(1,1);
    }
}
