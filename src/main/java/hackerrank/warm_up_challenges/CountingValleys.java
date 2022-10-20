package hackerrank.warm_up_challenges;

public class CountingValleys {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int uCount = 0;
        int seaLevel;
        int result = 0;

        for (int i = 0; i < path.length(); i++) {
            seaLevel = uCount;
            if (path.charAt(i) == 'D') {
                uCount--;
                if (seaLevel == 0){
                    result++;
                }
            } else {
                uCount++;
            }
            System.out.println(String.format("Index is: %d, U is: %d, Sea Level is: %d", i, uCount, seaLevel));
        }
        return result;
    }
}
