public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(guessedLetters.contains(letter)){
            return;
        }
        if(!word.contains(letter)){
            numberOfFaults++;
            guessedLetters += letter;
            return;
        }
        if(word.contains(letter)){
            guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        int i = 0;
        String hidden = "";
        while (i < word.length()){
            char c = word.charAt(i);
            String ch = "" + c;
            if(guessedLetters.contains(ch)){
                hidden += word.charAt(i);
            }else{
                hidden += "_";
            }
            i++;
        }
        return hidden;
    }
}