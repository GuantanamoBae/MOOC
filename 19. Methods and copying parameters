import java.util.ArrayList;

public class Main {

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
        first.addAll(second);
    }

    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second){
        for(int i : second){
            if(!first.contains(i)){
                first.add(i);
            }
        }

    }

    public static void main(String[] args) {
//        Exercise 70: Combining ArrayLists
//        Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) that inserts the items in a list called second to a list called first.
//        The order of the items can be anything and the same item can appear in the list more than once.
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(4);
        list1.add(3);
        list2.add(3);
        list2.add(5);
        list2.add(10);
        list2.add(7);
        combine(list1, list2);
        System.out.println(list1); // prints [4, 3, 3, 5, 10, 7]
        System.out.println(list2); // prints [3, 5, 10, 7]
//        Exercise 71: Smart combining
//        Create the method smartCombine that works like the previous combine method except that numbers can be on the list only once.
//        This means that the method adds a new number to the list only if the list does not already contain that number.
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list3.add(4);
        list3.add(3);
        list4.add(3);
        list4.add(5);
        list4.add(10);
        list4.add(7);
        smartCombine(list3, list4);
        System.out.println(list3); // prints [4, 3, 5, 10, 7]
        System.out.println(list4); // prints [3, 5, 10, 7]
    }
}
