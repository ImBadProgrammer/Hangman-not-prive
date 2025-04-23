import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class WordEliminator extends Words {

    private final List<String> ModdedWordList = new ArrayList<>();

    public WordEliminator() {
        readFile("american-english.txt");
    }

    public List<String> getModdedWordList() {
        // Use LinkedHashSet to remove duplicates and maintain order
        LinkedHashSet<String> noDupes = new LinkedHashSet<>(getWordList());

        for (String str : noDupes) {
            if (!str.contains(" ") && !str.contains(",") && !str.contains("-") && !str.contains("]")
                    && !str.contains("é")) {
                ModdedWordList.add(str);
            }
        }

        return ModdedWordList;
    }

}


