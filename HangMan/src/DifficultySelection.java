import java.util.ArrayList;
import java.util.List;

public class DifficultySelection implements isDifficultLevel{

    private final List<String> bigAhhWords = new ArrayList<>();

    String file = "american-english.txt";

    EasyWords easyWords = new EasyWords(file);
    MediumWords mediumWords = new MediumWords(file);
    HardWords hardWords = new HardWords(file);
    ExtremeWords extremeWords = new ExtremeWords(file);

    @Override
    public List<String> getEasyWords() {
        return easyWords.getFiveLetterWordList();
    }

    @Override
    public List<String> getMediumWords() {
        return mediumWords.getSixLetterWordList();
    }

    @Override
    public List<String> getHardWords() {
        return hardWords.getSevenLetterWordList();
    }

    @Override
    public List<String> getExtremeWords() {
        return extremeWords.getEightLetterWordList();
    }

    public List<String> getBigAhhWords(){

        bigAhhWords.add("antidisestablishmentarianism");
        bigAhhWords.add("floccinaucinihilipilification");
        bigAhhWords.add("pseudopseudohypoparathyroidism ");
        bigAhhWords.add("incomprehensibilities");
        bigAhhWords.add("pneumonoultramicroscopicsilicovolcanoconiosis");
        bigAhhWords.add("hippopotomonstrosesquippedaliophobia"); //the fear of big words lol
        bigAhhWords.add("honorificabilitudinitatibus");
        bigAhhWords.add("xenotransplantation");

        return bigAhhWords;
    }

}
