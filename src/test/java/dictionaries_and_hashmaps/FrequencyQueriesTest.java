package dictionaries_and_hashmaps;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyQueriesTest {
    @Test
    public void success_freqQuery_example_0() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1,5));
        queries.add(Arrays.asList(1,6));
        queries.add(Arrays.asList(3,2));
        queries.add(Arrays.asList(1,10));
        queries.add(Arrays.asList(1,10));
        queries.add(Arrays.asList(1,6));
        queries.add(Arrays.asList(2,5));
        queries.add(Arrays.asList(3,2));
        Assert.assertEquals(FrequencyQueries.freqQuery(queries), Arrays.asList(0,1));
    }

    @Test
    public void success_freqQuery_example_1() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(3,4));
        queries.add(Arrays.asList(2,1003));
        queries.add(Arrays.asList(1,16));
        queries.add(Arrays.asList(3,1));
        Assert.assertEquals(FrequencyQueries.freqQuery(queries), Arrays.asList(0,1));
    }

    @Test
    public void success_freqQuery_example_2() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1,3));
        queries.add(Arrays.asList(2,3));
        queries.add(Arrays.asList(3,2));
        queries.add(Arrays.asList(1,4));
        queries.add(Arrays.asList(1,5));
        queries.add(Arrays.asList(1,5));
        queries.add(Arrays.asList(1,4));
        queries.add(Arrays.asList(3,2));
        queries.add(Arrays.asList(2,4));
        queries.add(Arrays.asList(3,2));
        Assert.assertEquals(FrequencyQueries.freqQuery(queries), Arrays.asList(0,1,1));
    }
}
