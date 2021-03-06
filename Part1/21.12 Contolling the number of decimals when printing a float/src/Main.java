import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Exercise 78.1: BoundedCounter
//        Implement class BoundedCounter with the following functionality:
//        A counter has an object variable that remembers the value of the counter. The value is within the range 0..upperBound
//        In the beginning the value is 0.
//        The upper bound of the value is defined by the constructor parameter.
//        The method next increments the value of the counter. If the value would be more that the upper limit, it wraps around and becomes zero.
//        The method toString returns a string representation of the counter value
        BoundedCounter counter = new BoundedCounter(4);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 10) {
            counter.next();
            System.out.println("Value: " + counter );
            i++;
        }

//        Exercise 78.2: Printing the initial zero
//        Imrove toString so that if the value of the counter is less than 10, it prefixes the value with 0.
//        If the value of the counter is e.g. 3, toString should produce "03". If the value is at least 10, e.g. 12, the returned string would be "12".
        BoundedCounter overTen = new BoundedCounter(14);
        System.out.println("Value at start: " + overTen );

        int j = 0;
        while ( j < 16){
            overTen.next();
            System.out.println("value: " + overTen );
            j++;
        }

//        Exercise 78.3: The first version of the clock
//        With two counter objects it possible for us to build a simple clock.
//        Hours can be represented by a counter with upper bound 23 and minutes by a counter with upper bound 59. As we all know, when minutes wrap around from 59 to 0, hours advance by one.
//        First you should implement the method getValue for the counters in the class:
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int k = 0;
        while ( k < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            minutes.next();
            if(minutes.getValue() == 0){
                hours.next();
            }
            k++;
        }

//        Exercise 78.4: The second version of the clock
//        Firstly implement the method setValue to the class BoundedCounter.
//        The method should set the value of the parameter to the counter unless the parameter is less than zero or larger than the upper bound.
//                In those cases, the method does not have any effect.
        Scanner reader = new Scanner(System.in);
        BoundedCounter sec = new BoundedCounter(59);
        BoundedCounter min = new BoundedCounter(59);
        BoundedCounter ho = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = reader.nextInt();
                System.out.print("minutes: ");
        int m = reader.nextInt();
                System.out.print("hours: ");
        int h = reader.nextInt();

                sec.setValue(s);
                min.setValue(m);
                ho.setValue(h);

        int l = 0;
        while ( l < 121 ) {
            System.out.println( ho + ":" + min + ":" + sec);   // the current time printed
            sec.next();
            if(sec.getValue() == 0){
                min.next();
                if(min.getValue() == 0){
                    ho.next();
                }
            }
            l++;
        }
    }
}
