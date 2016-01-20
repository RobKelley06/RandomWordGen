import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nicholaswebb on 1/19/16.
 */
public class GeneratorTest {

    @Test
    public void testGenerateWord() throws Exception {
        String s = "a";
        //End Test Case Input


        Generator gen = new Generator();
        String a = gen.generateWord(s);
        String b = a.substring(0,1);
        assertEquals(s,b);
        assertNotEquals(1,a.length());
        assertNotEquals(0,a.length());
    }
}