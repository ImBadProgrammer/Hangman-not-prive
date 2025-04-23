import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RandomWordGenerator randomWordGenerator = new RandomWordGenerator();
        Hangman hangman = new Hangman();
        Scanner scanner = new Scanner(System.in);

        String randomEasyWord = randomWordGenerator.getEasyWord();
        String randomMediumWord = randomWordGenerator.getMediumWord();
        String randomHardWord = randomWordGenerator.getHardWord();
        String randomExtremeWord = randomWordGenerator.getExtremeWord();
        String randomRandomWord = randomWordGenerator.getRandomWord();
        String randomBigWord = randomWordGenerator.getBigWord();

        System.out.println("""
            [Choose a difficulty]
            1 [easy]
            2 [medium]
            3 [hard]
            4 [extreme]
            5 [random]
            6 [are you sure?]
            [type a number 1-6] :
            """);

        int difficultySelect = scanner.nextInt();

        switch (difficultySelect) {
            case 1:
                System.out.println("Let's play HangMan!\n");
                hangman.toLetters(randomEasyWord );
                System.out.print("The word was " + hangman.guess(randomEasyWord ));
                break;
            case 2:
                System.out.println("Let's play HangMan!\n");
                hangman.toLetters(randomMediumWord);
                System.out.print("The word was " + hangman.guess(randomMediumWord));
                break;
            case 3:
                System.out.println("Let's play HangMan!\n");
                hangman.toLetters(randomHardWord);
                System.out.print("The word was " + hangman.guess(randomHardWord));
                break;
            case 4:
                System.out.println("Let's play HangMan!\n");
                hangman.toLetters(randomExtremeWord);
                System.out.print("The word was " + hangman.guess(randomExtremeWord));
                break;
            case 5:
                System.out.println("Let's play HangMan!\n");
                hangman.toLetters(randomRandomWord);
                System.out.print("The word was " + hangman.guess(randomRandomWord));
                break;
            case 6:
                System.out.println("Let's play HangMan!\n");
                hangman.toLetters(randomBigWord);
                System.out.print("The word was " + hangman.guess(randomBigWord));
                break;
        }
    }
}