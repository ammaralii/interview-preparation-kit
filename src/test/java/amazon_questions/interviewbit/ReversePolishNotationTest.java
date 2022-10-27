package amazon_questions.interviewbit;

import org.junit.Assert;
import org.junit.Test;

public class ReversePolishNotationTest {
    @Test
    public void success_find_test_0() {
        Assert.assertTrue(ReversePolishNotation.find(new String[]{"5","3","+","2","/"}) == 4);
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(ReversePolishNotation.find(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}) == 22);
    }
}
