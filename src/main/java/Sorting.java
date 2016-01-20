import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by rkelly on 1/19/16.
 */
public class Sorting {
    public static LinkedList sortingWords(LinkedList sentList) {
        Collections.sort(sentList);
        return sentList;
    }
}