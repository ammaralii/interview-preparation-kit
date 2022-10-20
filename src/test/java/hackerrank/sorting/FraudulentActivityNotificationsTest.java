package hackerrank.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FraudulentActivityNotificationsTest {
    @Test
    public void success_activityNotifications_test_0() {
        Assert.assertEquals(FraudulentActivityNotifications.activityNotifications(Arrays.asList(2,3,4,2,3,6,8,4,5), 5), 2);
    }

    @Test
    public void success_activityNotifications_test_1() {
        Assert.assertEquals(FraudulentActivityNotifications.activityNotifications(Arrays.asList(1,2,3,4,4), 4), 0);
    }

    @Test
    public void success_activityNotifications_test_2() {
        Assert.assertEquals(FraudulentActivityNotifications.activityNotifications(Arrays.asList(10,20,30,40,50), 3), 1);
    }
}
