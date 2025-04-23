import java.util.ArrayList;
import java.util.List;

public class DifficultySelect extends WordEliminator{

    List<String> bigAhhWords = new ArrayList<>();

    public List<String> getWordsByLength(int min, int max) {
        List<String> wordLength = new ArrayList<>();

        for (String word : getModdedWordList()) {
            if (word.length() >= min && word.length() <= max) {
                wordLength.add(word);
            }
        }
        return wordLength;
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
