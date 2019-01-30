public class Main {

    public static void main(String[] args) {
//        Exercise 91.1: Next day
//        Add to the class MyDate the method public void advance() that advances the date by one.

//        Exercise 91.2: Advancing many days

//        Exercise 91.3: Creation of a new date
//        Add to the class MyDate the method MyDate afterNumberOfDays(int days), that returns a new MyDate-object that has
//        the date which equals the date of the object for which the method was called advance by the parameter of the method days.
        MyDate day = new MyDate(25, 2, 2011);
        MyDate newDate = day.afterNumberOfDays(7);
        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is  " + day.afterNumberOfDays(790));

//        Exercise 92.1: Difference in years, first version
//        Add to the class MyDate the method public int differenceInYears(MyDate comparedDate),
//        that calculates the difference in years of the object for which the method is called and the object given as parameters.
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( second + " and " + first + " difference in years: " + second.differenceInYears(first) );

        System.out.println( third + " and " + first + " difference in years: " + third.differenceInYears(first) );

        System.out.println( second + " and " + third + " difference in years: " + second.differenceInYears(third) );

//        Exercise 92.2: More accuracy
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( first + " and " + second + " difference in years: " + second.differenceInYears(first) );
        System.out.println( second + " and " + first + " difference in years: " + first.differenceInYears(second) );
        System.out.println( first + " and " + third + " difference in years: " + third.differenceInYears(first) );
        System.out.println( third + " and " + first + " difference in years: " + first.differenceInYears(third) );
        System.out.println( third + " and " + second + " difference in years: " + second.differenceInYears(third) );
        System.out.println( second + " and " + third + " difference in years: " + third.differenceInYears(second) );

//        Exercise 92.3: And the final version
//        Modify the method so that it works no matter which date is later, the one for which the method is called or the parameter.
    }
}
