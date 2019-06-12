import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Exercise 79.1: Amount of numbers
//        Implement class NumberStatistics with the following methods:
//        addNumber adds a new number to the statistics
//        amountOfNumbers tells us how many numbers have been added to the statistics
//        Note that the class should not store the added numbers.
//        At this stage, it is enough to remember how many added numbers there are, i.e. how many times the method addNumber has been called.
        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());

//        Exercise 79.2: sum and average
//        Add the following methods to the class:
//        sum returns the sum of the added numbers (if no numbers added, the sum is 0)
//        average returns the average of the added numbers (if no numbers added, the average is 0)
        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());

//        Exercise 79.3: Asking for numbers from the user
//        Create a program that asks the user to input numbers of type integer.
//                When the user gives -1, the program stops and prints the sum of the given numbers (excluding the -1).
        NumberStatistics stats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Type numbers: ");
        while(true){
            int numbers = reader.nextInt();
            if(numbers == -1) {
                break;
            }
            stats.addNumber(numbers);
        }
        System.out.println("sum: " + stats.sum());

//        Exercise 79.4: Many sums
//        Change your program so that it also calculates the sum of even and odd numbers in the user input (again -1 excluded).
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Type numbers: ");
        while(true){
            int numbers = reader.nextInt();
            if(numbers == -1) {
                break;
            }
            if(numbers % 2 == 0){
                even.addNumber(numbers);
            }
            if(numbers % 2 != 0){
                odd.addNumber(numbers);
            }
            sum.addNumber(numbers);
        }
        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
