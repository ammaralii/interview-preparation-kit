package interviews.aurora_solutions.coding_challenge_coderbyte.question;

public class Question2 {
    public static String StringChallenge(String str) {
        String output = "";
        boolean lastWasOdd = false;

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));

            if (digit % 2 == 1 && lastWasOdd) {
                output += "-";
            }

            output += digit;

            lastWasOdd = digit % 2 == 1 && digit != 0;
        }

        return output;
    }
}
