package hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulationTest {
    @Test
    public void success_jumpingOnClouds_example() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 2, 100));
        arr.add(Arrays.asList(2, 5, 100));
        arr.add(Arrays.asList(3, 4, 100));
        Assert.assertEquals(ArrayManipulation.arrayManipulation(5, arr), 200);
    }

    @Test
    public void success_jumpingOnClouds_test_0() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 5, 3));
        arr.add(Arrays.asList(4, 8, 7));
        arr.add(Arrays.asList(6, 9, 1));
        Assert.assertEquals(ArrayManipulation.arrayManipulation(10, arr), 10);
    }

    @Test
    public void success_jumpingOnClouds_test_1() {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(2, 6, 8));
        arr.add(Arrays.asList(3, 5, 7));
        arr.add(Arrays.asList(1, 8, 1));
        arr.add(Arrays.asList(5, 9, 15));
        Assert.assertEquals(ArrayManipulation.arrayManipulation(10, arr), 31);
    }
}
