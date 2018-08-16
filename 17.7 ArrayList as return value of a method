import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for(String i : list){
            lengths.add(i.length());
        }
        return lengths;
    }

    public static int greatest(ArrayList<Integer> num) {
        int greatest = 0;
        for(int i : num){
            if(i > greatest){
                greatest = i;
            }
        }
        return greatest;
    }

    public static double variance(ArrayList<Integer> num) {
        double var = 0;
        for(int i : num){
            var += ((i - average(num)) * (i - average(num)));
        }
        var = var / (num.size() - 1) * 1.0;
        return var;
    }
    //used for variance
    public static double average(ArrayList<Integer> list) {
        double num = sum(list) * 1.0;
        double den = list.size() * 1.0;
        double average = num / den;
        return average;
    }
    //used for variance
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
//        Exercise 65: The lengths of the Strings
//        Create the method lengths that gets a list of String variables as a parameter and returns an ArrayList that contains the lengths of the Strings in the same order as the original list.
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of the Strings: " + lengths);

//        Exercise 66: The Greatest
//        Create the method greatest, which receives a list of numbers (ArrayList<Integer>) as a parameter and then returns the greatest number in the list as a return value.
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(3);
        num.add(2);
        num.add(7);
        num.add(2);
        System.out.println("The greatest number is: " + greatest(num));

//        Exercise 67: Variance
//        Create the method variance, which receives a list of integers as a parameter and then returns the sample variance of that list.
        System.out.println("The variance is: " + variance(num));
    }
}
