import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Words {

        private final List<String> wordList = new ArrayList<>();

        BufferedReader reader = null;
        String line = "";

        public void readFile(String file){
                try {
                        reader = new BufferedReader(new FileReader(file));
                        while((line = reader.readLine()) != null) {
                                wordList.add(line);
                        }
                }
                catch(Exception e){
                        System.out.println("An error occurred");
                }
        }

        public List<String> getWordList() {
                return wordList;
        }

}