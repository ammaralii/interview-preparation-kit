package dsa.mathematics_and_number_theory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SieveOfEratoSthenesTest {
    private static int size = 100;
    private static boolean isPrime[] = new boolean[size];

    @Before
    public void setUp() {
        if (isPrime[3] == true) {
            return;
        }
        // do the setup
        isPrime = SieveOfEratoSthenes.find(size);
        for (int i = 0; i <= size; i++) {
            if (isPrime[i]){
                System.out.print(i + ",");
            }
        }
    }

    @Test
    public void success_find_test_0() {
        Assert.assertTrue(isPrime[7]);
    }

    @Test
    public void success_find_test_1() {
        Assert.assertTrue(isPrime[11]);
    }
}
