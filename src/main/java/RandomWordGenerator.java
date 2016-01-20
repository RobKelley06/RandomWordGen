
/**
 * Created by nicholaswebb on 1/19/16.
 */
import java.util.*;
public class RandomWordGenerator {




    public static LinkedList<String> GenerateRandomWords(int numberOfWords,String startingChars){

        LinkedList<String> splitStartingChars = new LinkedList<String>();
        for(int i = 0; i < startingChars.length(); i++) {
            splitStartingChars.add(startingChars.substring(i,i+1));
        }

        LinkedList<String> unSortedChars = WordLoop.generateWordLoop(numberOfWords, splitStartingChars);
        String s = unSortedChars.toString();
        System.out.println(s.substring(1, s.length()-1));
        LinkedList<String> sortedWords = new LinkedList<String>();
        sortedWords = Sorting.sortingWords(unSortedChars);
        return sortedWords;

    }






}




