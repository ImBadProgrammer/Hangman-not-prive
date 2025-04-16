import java.util.ArrayList;
import java.util.List;

public class ExtremeWords extends WordEliminator{

    private final List<String> eightLetterList = new ArrayList<>();

    public ExtremeWords(String file) {
        readFile(file);
    }

    public List<String> getEightLetterWordList(){
        List<String> newlist = new ArrayList<>(getModdedWordList());

        for (String str : newlist){
            if (str.length() <= 18 && str.length() >= 13) {
                eightLetterList.add(str);
            }
        }
        return eightLetterList;
    }
}
