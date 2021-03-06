public class Main {
    //        Exercise 94.1: Person
//        Exercise 94.2: Adding persons to Phonebook
//        Exercise 94.3: Searching for numbers from the phonebooks
//        Exercise 95.1: Plus
    public static void main(String[] args) {
//        Exercise 94.1: Person
//        implement the following class:
//        the method public String toString(), which returns the string representation formulated as the above example shows
//        constructor that sets the person name and phone number
//        public String getName(), that returns the name
//        public String getNumber(), that returns the phone number
//        the method public void changeNumber(String newNumber), that can be used to change the phone number of the person
        Person pekka = new Person("Pekka Mikkola", "040-123123");

        System.out.println(pekka.getName());
        System.out.println(pekka.getNumber());

        System.out.println(pekka);
        pekka.changeNumber("050-333444");
        System.out.println(pekka);

//        Exercise 94.2: Adding persons to Phonebook
//        Program the class Phonebook that stores Person-objects using an ArrayList. At this stage you'll need the following methods:
//        public void add(String name, String number) creates a Person-object and adds it to the ArrayList inside the Phonebook
//        public void printAll(), prints all the persons inside the Phonebook
        Phonebook phonebook = new Phonebook();

        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        phonebook.printAll();

//        Exercise 94.3: Searching for numbers from the phonebooks
//        Extend the class Phonebook with the method public String searchNumber(String name), that returns the phone number corresponding to the given name.
//        If the sought person is not known the string "number not known" is returned.
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println( number );

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println( number );

//        Exercise 95.1: Plus
//        Implementing the method public Money plus(Money added), that returns a new Money object that has a value equal to the sum of the object
//        for which the method was called and the object given as parameter.
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NOTE: new Money-object is created and reference to that
        //           is assigned to variable a.
        //       The Money object 10.00e that variable a used to hold
        //           is not referenced anymore

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

//        Exercise 95.2: less
//        Create the method public boolean less(Money compared), that returns true if the
//        object for which the method was called is less valuable than the object given as parameter.
        Money a = new Money(10,0);
        Money b = new Money(3,0);
        Money c = new Money(5,0);

        System.out.println(a.less(b));  // false
        System.out.println(b.less(c));  // true

//        Exercise 95.3: Minus
//        And finally create the method public Money minus(Money decremented), that returns a new Money object that
//        has a value equal to the object for which the method was called minus the object given as parameter.
//                If the value would be negative, the resulting Money object should have the value 0.
        Money a = new Money(10,0);
        Money b = new Money(3,50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
