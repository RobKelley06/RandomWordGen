import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by rkelly on 1/19/16.
 */
public class WordLoopTest {
    @Test
    public void testWordLoop() throws Exception {
        int numWords = 9;
        String sentWords = new String("qwert");
        //End Test Chase Input

        LinkedList<String> unOrderedChar = new LinkedList<String>();
        for (int i = 0; i < sentWords.length(); i++) {
            unOrderedChar.add(sentWords.substring(i,i+1));
        }


        LinkedList<String> expectedOrderedChar = new LinkedList<String>();
        for(int i = 0,  a = 0; i < numWords; i ++, a++) {
            if (a == unOrderedChar.size()) {
                a = 0;
            }
            String send = unOrderedChar.get(a);
            expectedOrderedChar.add(send);
        }
        LinkedList<String> returnValues = WordLoop.generateWordLoop(numWords,unOrderedChar);
        LinkedList<String> returnFirstChar = new LinkedList<String>();
        for(String firstLetter: returnValues) {
            returnFirstChar.add(firstLetter.substring(0,1));
        }
        assertEquals(expectedOrderedChar, returnFirstChar);
    }
}