package string_manipulation;

import org.junit.Assert;
import org.junit.Test;

public class CommonChildTest {
    @Test
    public void success_commonChild_test_0() {
        Assert.assertEquals(CommonChild.commonChild("HARRY","SALLY"), 2);
    }

    @Test
    public void success_commonChild_test_1() {
        Assert.assertEquals(CommonChild.commonChild("AA","BB"), 0);
    }

    @Test
    public void success_commonChild_test_2() {
        Assert.assertEquals(CommonChild.commonChild("SHINCHAN","NOHARAAA"), 3);
    }
}
