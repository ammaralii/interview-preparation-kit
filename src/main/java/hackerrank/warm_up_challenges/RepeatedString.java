package hackerrank.warm_up_challenges;

public class RepeatedString {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        System.out.println("String is: " + s);
        long count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        count = n/s.length() * count;
        long remainingString = n - (n/s.length() * s.length());
        System.out.println("Remaining String: " + remainingString);
        for(int i=0;i<remainingString;i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}
