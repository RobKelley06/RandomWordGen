import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by nicholaswebb on 1/19/16.
 */
public class SortingTest {

    @Test
    public void testSortingWords() throws Exception {
        LinkedList<String> abc = new LinkedList<String>();
        abc.add("t");
        abc.add("o");
        abc.add("a");
        abc.add("g");
        //End Test Chase Input

        Sorting sort = new Sorting();
        assertEquals(abc, sort.sortingWords(abc));


    }
}