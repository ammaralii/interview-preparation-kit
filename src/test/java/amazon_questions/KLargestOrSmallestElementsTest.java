package amazon_questions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KLargestOrSmallestElementsTest {
    @Test
    public void success_kSmallestOrLargest_test_0() {
        List<Integer> list = Arrays.asList(3, 7, 1, 2, 8, 4, 5);
        List<Integer> result = Arrays.asList(1, 2, 3);
        Assert.assertTrue(KLargestOrSmallestElements.kSmallestOrLargest(list, 3, KLargestOrSmallestElements.KLargestOrSmallestElementsEnum.SMALLEST).equals(result));
    }

    @Test
    public void success_kSmallestOrLargest_test_1() {
        List<Integer> list = Arrays.asList(3, 7, 1, 2, 8, 4, 5);
        List<Integer> result = Arrays.asList(5,7,8);
        Assert.assertTrue(KLargestOrSmallestElements.kSmallestOrLargest(list, 3, KLargestOrSmallestElements.KLargestOrSmallestElementsEnum.LARGEST).equals(result));
    }
}
