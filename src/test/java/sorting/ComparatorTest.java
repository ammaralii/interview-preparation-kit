package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    @Test
    public void success_compare_test_0() {
        List<Player> players = Arrays.asList(
                new Player("smith", 20),
                new Player("jones", 15),
                new Player("jones", 20)
        );
        List<Player> playersSorted = Arrays.asList(
                new Player("jones", 20),
                new Player("smith", 20),
                new Player("jones", 15)
        );

        Comparator comparator = new Comparator();
        Collections.sort(players, comparator);
        Assert.assertEquals(players.get(0).name, playersSorted.get(0).name);
    }
}
