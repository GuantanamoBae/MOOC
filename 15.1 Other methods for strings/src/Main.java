import java.util.Scanner;

public class Main {
    public static String reverse(String text) {
        String helper = "";
        int i = text.length();
        while(i > 0){
            helper += text.charAt(i - 1);
            i--;
        }
        return helper;
    }

    public static void main(String[] args) {
        //Exercise 53: First part
        //Create a program that prints the first part of a word.
        // The program asks the user for the word and the length of the first part.
        // Use the substring method in your program.
        System.out.println("Enter a Word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int i = word.length() - 2;
        System.out.println("Length of the first part of the word: " + i);
        System.out.println("Result: " + word.substring(0,i));

        //Exercise 54: The end part
        //Create a program that prints the end part of a word.
        //The program asks the user for the word and the length of the end part.
        //Use the substring method in your program.
        System.out.println("Length of the end part of the word: " + (word.length() - i));
        System.out.println("Result: " + word.substring(i));

        //Exercise 55: A word inside a word
        //Create a program that asks the user for two words.
        //Then the program tells if the second word is included in the first word.
        //Use String method indexOf in your program.
        System.out.println("Enter the first word: ");
        Scanner word1 = new Scanner(System.in);
        String first = word1.nextLine();
        System.out.println("Enther the second word: ");
        Scanner word2 = new Scanner(System.in);
        String second = word2.nextLine();
        int index = first.indexOf(second);
        if(index == -1){
            System.out.println("The word " + "'" + second + "'" + "is not found in the word " + "'" + first + "'.");
        }
        else{
            System.out.println("The word " + "'" + second + "'" + "is found in the word " + "'" + first + "'.");
        }
        //Exercise 56: Reversing text
        //Create the method reverse that puts the given string in reversed order.
        //Use the following program body for the method:
        System.out.print("Type in your text: ");
        String text = scanner.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
