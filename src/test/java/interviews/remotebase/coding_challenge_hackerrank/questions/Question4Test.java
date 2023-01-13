package interviews.remotebase.coding_challenge_hackerrank.questions;

import interviews.remotebase.coding_challenge_hackerrank.question.Question4;
import org.junit.Assert;
import org.junit.Test;

public class Question4Test {
    @Test
    public void success_mergePalindromes_example_0() {
        Assert.assertEquals(Question4.mergePalindromes("aabbc","ddefefq"), "abdefcfedba");
    }

    @Test
    public void success_mergePalindromes_test_0() {
        Assert.assertEquals(Question4.mergePalindromes("aab","cca"), "acaca");
    }

    @Test
    public void success_mergePalindromes_test_1() {
        Assert.assertEquals(Question4.mergePalindromes("adaab","cac"), "aaccaa");
    }

    @Test
    public void success_mergePalindromes_test_2() {
        Assert.assertEquals(Question4.mergePalindromes("aaaabbbccc","ddeeccc"), "aabcccdeedcccbaa");
    }

    @Test
    public void success_mergePalindromes_test_3() {
        Assert.assertEquals(Question4.mergePalindromes("awwzaigvxuikdqlvshspsvyckttwdzqmarpxglwmpob","dtisfxyobndu"), "abddgiklmpqstvwwxzzxwwvtsqpmlkigddba");
    }

    @Test
    public void success_mergePalindromes_test_4() {
        Assert.assertEquals(Question4.mergePalindromes("mgbgikhvjyiigxhsrgekjmjkrs","cikmqfxpcybzyhbdrhudjmsoaqdurgjsnjlqogrkcmdtxbyazfxvbprimbcblpnriyvndntmpvjun"), "abbbccddfggghhiiijjjkklmmmnnoppqrrrsstuvxyyzzyyxvutssrrrqpponnmmmlkkjjjiiihhgggfddccbbba");
    }
}
