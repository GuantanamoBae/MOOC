import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> translator;

    public Dictionary(){
        this.translator = new HashMap<>();
    }

    public void add(String fin, String eng) {
        this.translator.put(fin, eng);
    }

    public String translate(String fin) {
        if(this.translator.containsKey(fin)){
            return this.translator.get(fin);
        }
        return null;
    }

    public int amountOfWords() {
        return this.translator.size();
    }

    public ArrayList<String> translationList() {

        ArrayList<String> listOfWords = new ArrayList();

        for (String i : this.translator.keySet()) {
            listOfWords.add(i + " = " + this.translator.get(i));
        }
        return listOfWords;
    }
}
