package hackerrank.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraysLeftRotationTest {
    @Test
    public void success_rotLeft_example() {
        Assert.assertEquals(ArraysLeftRotation.rotLeft(Arrays.asList(1,2,3,4,5), 4), Arrays.asList(5,1,2,3,4));
    }

    @Test
    public void success_rotLeft_test_0() {
        Assert.assertEquals(
                ArraysLeftRotation.rotLeft(Arrays.asList(41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51), 10),
                Arrays.asList(77,97,58,1,86,58,26,10,86,51,41,73,89,7,10,1,59,58,84,77)
        );
    }

    @Test
    public void success_rotLeft_test_1() {
        Assert.assertEquals(
                ArraysLeftRotation.rotLeft(Arrays.asList(33,47,70,37,8,53,13,93,71,72,51,100,60,87,97), 13),
                Arrays.asList(87,97,33,47,70,37,8,53,13,93,71,72,51,100,60)
        );
    }
}
