package hackerrank.string_manipulation;

public class SpecialStringAgain {
    // Complete the substrCount function below.
    public static long substrCount(int n, String str) {
        for (int i = 0; i < str.length(); i++) {
            char iIndexChar = str.charAt(i);

            int middleIndexChar = -1;

            for (int j = i+1; j < str.length(); j++) {
                char jIndexChar = str.charAt(j);

                // Check for characters except the middle one are the same and
                // All of the characters are the same
                if (iIndexChar == jIndexChar) {
                    if ( (middleIndexChar == -1) || (j - middleIndexChar) == (middleIndexChar - i)) {
                        n++;
                    }
                } else if (middleIndexChar == -1) {
                    middleIndexChar = j;
                } else {
                    break;
                }
            }
        }
        return n;
    }
}
