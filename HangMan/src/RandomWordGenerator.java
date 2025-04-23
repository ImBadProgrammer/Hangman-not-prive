import java.util.List;
import java.util.Random;

public class RandomWordGenerator extends DifficultySelect{

    private final Random random = new Random();

    public String getRandomWord() {
        List<String> words = getWordsByLength(0, 31);

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public String getEasyWord(){
        List<String> words = getWordsByLength(4, 6);

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public String getMediumWord(){
        List<String> words = getWordsByLength(7, 9);

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public String getHardWord(){
        List<String> words = getWordsByLength(10, 13);

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public String getExtremeWord(){
        List<String> words = getWordsByLength(13, 16);

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }


    public String getBigWord(){
        List<String> words = getBigAhhWords();

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

}
