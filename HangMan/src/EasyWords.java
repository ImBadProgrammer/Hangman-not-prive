import java.util.ArrayList;
import java.util.List;

public class EasyWords extends WordEliminator{
    private final List<String> fiveLetterList = new ArrayList<>();

    public EasyWords(String file) {
        readFile(file);
    }

    public List<String> getFiveLetterWordList(){
        List<String> newlist = new ArrayList<>(getModdedWordList());

        for (String str : newlist){
            if (str.length() <= 6 && str.length() >= 4) {
                fiveLetterList.add(str);
            }
        }
        return fiveLetterList;
    }

}
