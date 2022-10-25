package dsa.mathematics_and_number_theory;


import java.math.BigInteger;

/**
 * <b>Factorial of a number</b> <br/>
 * Find the factorial of 5, 10 and 1000
 */
public class Factorial {
    public static String find(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        BigInteger index = BigInteger.TWO;
        BigInteger limit = n.add(BigInteger.ONE);
        while (!index.equals(limit)) {
            result = result.multiply(index);
            index = index.add(BigInteger.ONE);
        }
        System.out.println("Result is: " + result);
        return String.valueOf(result);
    }
}
