package interviews.remotebase.coding_challenge_hackerrank.question;

public class Question2 {
    public static int countTeams(int[] skills, int minplayers, int minLevel, int maxLevel) {
        int count = 0;
        for (int skill : skills) {
            if (minLevel <= skill && skill <= maxLevel) {
                count++;
            }
        }
        return count >= minplayers ? (factorial(count) / (factorial(count - minplayers) * factorial(minplayers))) : 0;
    }

    static int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }
}
