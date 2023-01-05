package interviews.remotebase.coding_challenge_hackerrank.question;

public class Question2 {
    public static int countTeams(int[] skills, int minplayers, int minLevel, int maxLevel) {
        int count = 0;
        for (int skill : skills) {
            if (minLevel <= skill && skill <= maxLevel) {
                count++;
            }
        }
        int result = 0;
        for (int i = minplayers; i <= count; i++) {
            int combination = 1;
            for (int j = count; j > count - i; j--) {
                combination *= j;
            }
            for (int j = i; j > 1; j--) {
                combination /= j;
            }
            result += combination;
        }
        return result;
    }
}
