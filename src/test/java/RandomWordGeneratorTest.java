import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by rkelly on 1/20/16.
 */
public class RandomWordGeneratorTest {

    @Test
    public void testMain() throws Exception {
        int numWords = 5;
        String letters = "grcm";
        //End Test Chase Input

        LinkedList<String> unOrderedChar = new LinkedList<String>();
        for (int i = 0; i < letters.length(); i++) {
            unOrderedChar.add(letters.substring(i,i+1));
        }
        LinkedList<String> expectedOrderedChar = new LinkedList<String>();
        for(int i = 0,  a = 0; i < numWords; i ++, a++) {
            if (a == unOrderedChar.size()) {
                a = 0;
            }
            String send = unOrderedChar.get(a);
            expectedOrderedChar.add(send);
        }
        Collections.sort(expectedOrderedChar);
        //end Expected Output

        LinkedList<String> output = RandomWordGenerator.GenerateRandomWords(numWords,letters);

        LinkedList<String> finalOutput = new LinkedList<String>();
        for(String o : output) {
            finalOutput.add(o.substring(0,1));
        }
        //end Checked Output

        assertEquals(expectedOrderedChar,finalOutput);
        for (String fO : finalOutput) {
            assertEquals(1, fO.length());
            assertNotEquals(0, fO.length());
        }
    }
}