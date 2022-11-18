package interviews.teamapt.online_assessment.questions;

import org.junit.Assert;
import org.junit.Test;

public class Question1Test {
    /**
     * <b>Explanation</b><br/>
     * <li>The sum of the first two elements, 1+2=3. The value of the last element is 3.</li>
     * <li>Using zero based indexing, arr[2]=3 is the pivot between the two subarrays.</li>
     * <li>The index of the pivot is 2.</li>
     */
    @Test
    public void success_balancedSum_test_0() {
        Assert.assertEquals(Question1.balancedSum(new int[]{1,2,3,3}),2);
    }

    /**
     * <b>Explanation</b><br/>
     * <li>The first and last elements are equal to 1.</li>
     * <li>Using zero based indexing, arr[1]=2 is the pivot between the two subarrays.</li>
     * <li>The index of the pivot is 1.</li>
     */
    @Test
    public void success_balancedSum_test_1() {
        Assert.assertEquals(Question1.balancedSum(new int[]{1,2,1}),1);
    }
}
