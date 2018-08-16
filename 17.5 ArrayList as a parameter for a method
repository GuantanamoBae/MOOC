import java.util.*;

public class Main {

    public static int countItems(ArrayList<String> list){
        int count = 0;
        for(String i : list){
            count++;
        }
        return count;
    }

    public static void removeLast(ArrayList<String> list){
        list.remove(countItems(list) - 1);
    }

    public static void main(String[] args) {
//        Exercise 61: Amount of items in a list
//        Create the method public static int countItems(ArrayList<String> list) that returns the number of the items in the list.
//        Your method should not print anything.
//        Use a return statement to return the number
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));

//        Exercise 62: Remove last
//        Create the method public static void removeLast(ArrayList<String> list), which removes the last item from the list.
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");
        System.out.println("brothers:");
        System.out.println(brothers);
        Collections.sort(brothers);
        removeLast(brothers);
        System.out.println(brothers);
    }
}
