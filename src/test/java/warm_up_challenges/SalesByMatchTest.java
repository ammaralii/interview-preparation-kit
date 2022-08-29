package warm_up_challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SalesByMatchTest {
    @Test
    public void success_sockMerchant() {
        List<Integer> list = Arrays.asList(1,2,1,2,1,3,2);
        Assert.assertEquals(SalesByMatch.sockMerchant(list.size(),list), 2);
    }
}
