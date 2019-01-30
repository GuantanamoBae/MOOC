public class Main {

    public static void main(String[] args) {
//        Exercise 96: Sum of the array
//        Implement the method public static sum(int[] array), which returns the sum of the numbers in the array given as parameter.
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
        printElegantly(array);
    }

    public static int sum(int[] array) {
        int total = 0;
        for(int i : array){
            total += i;
        }
        return total;
    }
//    Exercise 97: Elegant printing of an array
//    Implement the method public static int printElegantly(int[] array), which prints the numbers in the array on the same row.
//    In the printout all the numbers should be separated with comma and whitespace and there should not be a comma trailing the last number.
    public static void printElegantly(int[] array) {
        for (int i = 0; i < array.length; i++ ) {
            System.out.print(array[i] + ", ");
        }
    }
}
