package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GasStationTest {
    @Test
    public void success_canCompleteCircuit_test_0() {
        Assert.assertTrue(GasStation.canCompleteCircuit(Arrays.asList(1, 2), Arrays.asList(2, 1)) == 1);
    }
}
