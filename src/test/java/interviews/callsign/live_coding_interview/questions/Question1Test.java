package interviews.callsign.live_coding_interview.questions;

import org.junit.Assert;
import org.junit.Test;

public class Question1Test {
    @Test
    public void success_maxSetSize_test_0() {
        Question1 question1 = new Question1();
        Assert.assertEquals(question1.allocate("apibox"), "apibox:1");
        Assert.assertEquals(question1.allocate("apibox"), "apibox:2");
        question1.deallocate("apibox:1");
        Assert.assertEquals(question1.allocate("apibox"), "apibox:1");
        Assert.assertEquals(question1.allocate("sitebox"), "sitebox:1");
    }
}
