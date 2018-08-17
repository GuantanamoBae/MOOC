import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        boolean result = true;
        int count = 0;
        for(int i : list){
            if(i == number){
                count++;
            }
        }
        if(count  <= 1){
            result = false;
        }
        return result;
    }

    public static boolean palindrome(String text) {
        boolean result = true;
        String helper = "";
        int i = 1;
        while(i < text.length() + 1){
            helper += text.charAt(text.length() - i);
            i++;
        }
        for(int j = 0; j < text.length(); j++){
            if(text.charAt(j) != helper.charAt(j)){
                result = false;
            }
        }
        return result;
    }


    public static void main(String[] args) {
//        Exercise 68: Is the number more than once in the list
//        Create the method moreThanOnce that gets a list of integers and an integer (i.e. number) as parameter.
//        If the number appears on the list more than once the method returns true and otherwise false.
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
//        Exercise 69: Palindrome
//        Create the method palindrome that checks if a string is a palindrome.
        Scanner string = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = string.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
