public class Main {

    public static void main(String[] args) {



        RandomWordGenerator randomWordGenerator = new RandomWordGenerator();

        String randomEasyWord = randomWordGenerator.getEasyWord();
        String randomMediumWord = randomWordGenerator.getMediumWord();
        String randomHardWord = randomWordGenerator.getHardWord();
        String randomExtremeWord = randomWordGenerator.getExtremeWord();
        String randomRandomWord = randomWordGenerator.getRandomWord();
        String randomBigWord = randomWordGenerator.getBigWord();

        Hangman hangman = new Hangman();

        System.out.println("Let's play HangMan!\n");
        hangman.toLetters(randomMediumWord);
        System.out.print("The word was " + hangman.guess(randomMediumWord));

    }
}