import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by nicholaswebb on 1/19/16.
 */
public class RetrieveConstraints {

    public static int getNumWords() {
        int numWords = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many words would you like?");
        while(true) {
            try {
                numWords = input.nextInt();
                System.out.println(" ");
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Numbers only!");
                input.nextLine();
            }
        }



        return numWords;
    }


  public  static LinkedList<String> getStartingChar() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your letters that the words will start with");

      while (!input.hasNext("[a-zA-Z]+")) {

          System.out.println("Please only put letters!");
          input.nextLine();
      }
      String word = input.nextLine();

      word=word.replaceAll("\\s", "");
      System.out.println("Got it, letters will be: " + word);
      String[] cArray = word.split("");
      LinkedList orderedChars = new LinkedList(Arrays.asList(cArray));

      return orderedChars;

  }

}
