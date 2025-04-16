import java.util.Scanner;
import java.util.ArrayList;

public class Hangman {

    String blank = "_";

    Scanner scanner = new Scanner(System.in);
    ArrayList<Character> letters = new ArrayList<>();
    ArrayList<Character> blanks = new ArrayList<>();

    String[] hangman = {
            "🤨",   // head
            "))",   // body
            "<",    // left arm
            ">",    // right arm
            "_/",   // left leg
            "\\_"   // right leg
    };

    public void toLetters(String word){
        //Makes two lists. One filled with blanks, and one that is the finished word
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
            blanks.add(blank.charAt(0));
        }
    }

    public String guess (String word) {
        int numAttempts = 0;

        //Allows the user to guess letters until the string of blanks matches the string of letters
        while (!blanks.equals(letters)) {
            System.out.print("Guess a letter:");

            char letter = scanner.nextLine().charAt(0);

            System.out.println();
            if (word.contains(String.valueOf(letter))) {
                for (int i = 0; i < letters.size(); i++) {
                    if (letters.get(i) == letter) {
                        blanks.set(i, word.charAt(i));
                    }
                }
                System.out.println(blanks.toString() + "\n");

            } else {

                System.out.println("Letter: " + letter + " is not in the word");
                numAttempts++;

                if (numAttempts == 1) {
                    System.out.println(hangman[0]);
                    System.out.println();
                } else if (numAttempts == 2) {
                    System.out.println(hangman[0]);
                    System.out.println(hangman[1]);
                    System.out.println();
                } else if (numAttempts == 3) {
                    System.out.println(" " + hangman[0]);
                    System.out.println(hangman[2] + " " + hangman[1]);
                    System.out.println();
                } else if (numAttempts == 4) {
                    System.out.println(" " + hangman[0]);
                    System.out.println(hangman[2] + " " + hangman[1] + " " + hangman[3]);
                    System.out.println();
                } else if (numAttempts == 5) {
                    System.out.println(" " + hangman[0]);
                    System.out.println(hangman[2] + " " + hangman[1] + " " + hangman[3]);
                    System.out.println(hangman[4]);
                    System.out.println();
                } else {
                    System.out.println(" " + hangman[0] + " Just gonna leave me hanging? ");
                    System.out.println(hangman[2] + " " + hangman[1] + " " + hangman[3]);
                    System.out.println(hangman[4] + " " + hangman[5]);
                    System.out.println();
                    break; //needs a break here after reaches 6th attempt
                }
            }
        }
        return word;
    }
}