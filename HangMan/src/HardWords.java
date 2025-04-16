import java.util.ArrayList;
import java.util.List;

public class HardWords extends WordEliminator{

    private final List<String> sevenLetterList = new ArrayList<>();

    public HardWords(String file) {
        readFile(file);
    }

    public List<String> getSevenLetterWordList(){
        List<String> newlist = new ArrayList<>(getModdedWordList());

        for (String str : newlist){
            if (str.length() <= 12 && str.length() >= 10) {
                sevenLetterList.add(str);
            }
        }
        return sevenLetterList;
    }
}
