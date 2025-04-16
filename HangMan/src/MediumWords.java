import java.util.ArrayList;
import java.util.List;

public class MediumWords extends WordEliminator{

    private final List<String> sixLetterList = new ArrayList<>();

    public MediumWords(String file) {
        readFile(file);
    }

    public List<String> getSixLetterWordList(){
        List<String> newlist = new ArrayList<>(getModdedWordList());

        for (String str : newlist){
            if (str.length() <= 9 && str.length() >= 7) {
                sixLetterList.add(str);
            }
        }
        return sixLetterList;
    }

}
