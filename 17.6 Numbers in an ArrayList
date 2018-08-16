import java.util.*;

public class Main {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double num = sum(list) * 1.0;
        double den = list.size() * 1.0;
        double average = num / den;
        return average;
    }

    public static void main(String[] args) {
//        Exercise 63: Sum of the numbers
//        Create the method sum, which receives a list of numbers (ArrayList<Integer>) as a parameter and then calculates the sum of the items in that list.
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The sum: " + sum(list));
        //list.add(10);
        System.out.println("the sum: " + sum(list));

//    Exercise 64: Average of numbers
//    Create the method average, which receives a list of numbers (ArrayList<Integer>) as a parameter and then calculates the average of the items in that list.
        System.out.println("The average is: " + average(list));
    }
}
