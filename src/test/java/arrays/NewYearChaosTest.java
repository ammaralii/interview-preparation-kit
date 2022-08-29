package arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NewYearChaosTest {
    @Test
    public void success_minimumBribes_example() {
        List<Integer> array = Arrays.asList(2,1,5,3,4);
        NewYearChaos.minimumBribes(array);
    }

    @Test
    public void success_minimumBribes_test_0() {
        List<Integer> array = Arrays.asList(2,5,1,3,4);
        NewYearChaos.minimumBribes(array);
    }

    @Test
    public void success_minimumBribes_test_1() {
        List<Integer> array = Arrays.asList(1,2,5,3,7,8,6,4);
        NewYearChaos.minimumBribes(array);
    }
}
