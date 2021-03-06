import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Exercise 57: Words
//        Create a program that asks the user to input words until the user types in an empty String.
//        Then the program prints the words the user gave.
//        Try the for repetition sentence here. Use an ArrayList structure in your program.
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            Scanner reader = new Scanner(System.in);
            String word = reader.nextLine();
            words.add(word);
            if (word.isEmpty()) {
                break;
            }
        }
        System.out.println("You typed the following words:\n");
        for (String i : words) {
            System.out.println(i);
        }
//        Exercise 58: Recurring word
//        Create a program that asks the user to input words until the user gives the same word twice.
//        Use an ArrayList structure in your program.
        Scanner read = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> newWords = new ArrayList<String>();
        while(true){
            System.out.println("Type a word: ");
            String newWord = read.nextLine();
            if(newWords.contains(newWord)){
                System.out.println("You gave the word "+ newWord +" twice.");
                break;
            }
            newWords.add(newWord);
        }
    }
}