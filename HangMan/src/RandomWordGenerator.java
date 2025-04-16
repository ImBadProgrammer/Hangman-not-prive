import java.util.List;
import java.util.Random;

public class RandomWordGenerator extends DifficultySelection{

    private final Random random = new Random();
    WordEliminator wordEliminator = new WordEliminator("american-english.txt");

    public String getRandomWord() {
        List<String> words = wordEliminator.getModdedWordList();

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public String getEasyWord(){
        List<String> words = getEasyWords();

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public String getMediumWord(){
        List<String> words = getMediumWords();

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public String getHardWord(){
        List<String> words = getHardWords();

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }

    public String getExtremeWord(){
        List<String> words = getExtremeWords();

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }


    public String getBigWord(){
        List<String> words = getBigAhhWords();

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }


}
