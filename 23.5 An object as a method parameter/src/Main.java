public class Main {

    public static void main(String[] args) {
//        Exercise 85.1: Weight of a person
//        The method gets a person object as a parameter.
//        The method is supposed to return the weight of the parameter, so the method should call a suitable method of person, get the return value and then return it to the caller.
        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);

        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");

//        Exercise 85.2: Feeding a person
//        In the previous part of the assignment, the method weight queried some information from the parameter object by calling its method.
//                It is also possible to change the state of the parameter. Add to class Reformatory the method public void feed(Person person) that increases the weight of its parameter by one.
        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.feed(brian);

        System.out.println("");

        System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");

//        Exercise 85.3: Number of times a weight has been measured
//        Add to class Reformatory the method public int totalWeightsMeasured() that returns the total number of times a weight has been measured.
        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(pekka);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);
        eastHelsinkiReformatory.weight(brian);

        System.out.println("total weights measured "+eastHelsinkiReformatory.totalWeightsMeasured());

//        Exercise 86.1: The "stupid" Lyyra card

        LyyraCard cardOfPekka = new LyyraCard(10);

        System.out.println("money on the card " + cardOfPekka.balance() );
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded );
        System.out.println("money on the card " + cardOfPekka.balance() );

//        Exercise 86.2: Cash Register and paying with cash
        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("the change was "  + theChange );

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("the change was "  + theChange );

        System.out.println( unicafeExactum );

//        Exercise 86.3: Paying with card
        CashRegister unicafeExactum = new CashRegister();

        double theChange = unicafeExactum.payEconomical(10);
        System.out.println("the change was " + theChange );

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);
        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println( unicafeExactum );

//        Exercise 86.4: Loading money
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );


    }
}
