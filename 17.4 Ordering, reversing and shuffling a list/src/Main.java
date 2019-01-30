import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Exercise 59: Words in reverse order
//        Create a program that asks the user to input words, until the user gives an empty string.
//        Then the program prints the words the user gave in reversed order, the last word is printed first etc.
        ArrayList<String> list = new ArrayList<String>();
        while(true){
            System.out.print("Enter a word: ");
            Scanner reader = new Scanner(System.in);
            String words = reader.nextLine();
            if(words.isEmpty()){
                break;
            }
            list.add(words);
        }
        System.out.println("----In reverse----");
        Collections.reverse(list);
        for(String word : list){
            System.out.println(word);
        }
//        Exercise 60: Words in alphabetical order
//        Create a similar program as the previous one, but in which the words are printed in alphabetical order.
        System.out.println("----In alphabetical----");
        Collections.sort(list);
        for(String word : list){
            System.out.println(word);
        }
    }
}
