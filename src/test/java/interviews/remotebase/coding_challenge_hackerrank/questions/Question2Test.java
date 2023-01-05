package interviews.remotebase.coding_challenge_hackerrank.questions;

import interviews.remotebase.coding_challenge_hackerrank.question.Question2;
import org.junit.Assert;
import org.junit.Test;

public class Question2Test {
    @Test
    public void success_countTeams_test_0() {
        int[] skills = {12, 4, 6, 13, 5, 10};
        int minPlayers = 3;
        int minLevel = 4;
        int maxLevel = 10;
        Assert.assertEquals(Question2.countTeams(skills, minPlayers, minLevel, maxLevel), 5);
    }

    @Test
    public void success_countTeams_test_1() {
        int[] skills = new int[]{};
        int minPlayers = 3;
        int minLevel = 4;
        int maxLevel = 10;
        Assert.assertEquals(Question2.countTeams(skills, minPlayers, minLevel, maxLevel), 0);
    }

    @Test
    public void success_countTeams_test_2() {
        int[] skills = new int[] {4, 5, 6, 7, 8};
        int minPlayers = 5;
        int minLevel = 4;
        int maxLevel = 8;
        Assert.assertEquals(Question2.countTeams(skills, minPlayers, minLevel, maxLevel), 1);
    }

    @Test
    public void success_countTeams_test_3() {
        int[] skills = new int[] {4, 5, 6, 7, 8};
        int minPlayers = 2;
        int minLevel = 4;
        int maxLevel = 8;
        Assert.assertEquals(Question2.countTeams(skills, minPlayers, minLevel, maxLevel), 10);
    }

    @Test
    public void success_countTeams_test_4() {
        int[] skills = new int[] {4, 5, 6, 7, 8};
        int minPlayers = 2;
        int minLevel = 9;
        int maxLevel = 10;
        Assert.assertEquals(Question2.countTeams(skills, minPlayers, minLevel, maxLevel), 0);
    }
}
