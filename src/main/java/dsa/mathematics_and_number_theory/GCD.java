package dsa.mathematics_and_number_theory;

public class GCD {
    public static Integer find(Integer a, Integer b) {
        if (a % b == 0) {
            return b;
        } else {
            return find(b, a % b);
        }
    }
}
