package dsa.mathematics_and_number_theory;

/**
 * <b>Factorial of a number</b> <br/>
 * Find the factorial of 5, 10 and 1000
 */
public class TrailingZeroInFactorial {
    public static Integer find(Integer n) {
        Integer result = 0;
        for (int i = 5; i <= n; i = i * 5) {
            result += n / i;
        }
        System.out.println("Result is: " + result);
        return result;
    }
}
