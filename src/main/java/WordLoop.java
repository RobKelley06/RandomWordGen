import java.util.LinkedList;

/**
 * Created by nicholaswebb on 1/19/16.
 */
public class WordLoop {


    public static LinkedList<String> generateWordLoop(int numWords, LinkedList<String> orderedChars) {
        LinkedList<String> unsortedWords = new LinkedList<String>();

        //System.out.println(orderedChars.toString());

        doneGenerating:
        for (int i = 0; i <numWords; ) {

            for (int x =0; x < orderedChars.size(); x++) {
                i++;
                if (i > numWords) {
                    break doneGenerating;
                }
                String abc = orderedChars.get(x);
                String def = Generator.generateWord(abc);
                unsortedWords.add(def);

            }
        }
        return unsortedWords;
    }
}