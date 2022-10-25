package dsa.mathematics_and_number_theory;

public class PalindromeNumbers {
    public static boolean find(Integer n) {
        Integer actualNumber = n;
        StringBuilder result = new StringBuilder();
        while (n != 0) {
            Integer temp = n % 10;
            result.append(temp);
            n = n / 10;
        }
        if (Integer.valueOf(result.toString()).equals(actualNumber)){
            return true;
        }
        return false;
    }
}
