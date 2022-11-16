package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {
    @Test
    public void success_mySqrt_test_0() {
        Assert.assertEquals(Sqrt.mySqrt(8), 2);
    }

    @Test
    public void success_mySqrt_test_1() {
        Assert.assertEquals(Sqrt.mySqrt(2147483647), 46340);
    }

    @Test
    public void success_mySqrt_test_2() {
        Assert.assertEquals(Sqrt.mySqrt(81), 9);
    }

    @Test
    public void success_mySqrt_test_3() {
        Assert.assertEquals(Sqrt.mySqrt(4), 2);
    }

    @Test
    public void success_mySqrt_test_4() {
        Assert.assertEquals(Sqrt.mySqrt(3), 1);
    }
}
