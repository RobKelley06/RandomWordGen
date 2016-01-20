import java.util.Random;

/**
 * Created by rkelly on 1/19/16.
 */

public class Generator {
    public static String generateWord(String sentLetter) {
        Random random = new Random();
        int numLetters = random.nextInt(8) +3;

        for (int i=0; i < numLetters;i++) {
            sentLetter += (char) ('a' + random.nextInt(26));
        }
        return sentLetter;
    }
}
