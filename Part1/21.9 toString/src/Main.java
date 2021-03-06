public class Main {

    public static void main(String[] args) {
//        Exercise 77.1: Class skeleton
//        Start by adding the class LyyraCard to your project.
//        Then implement the LyyraCard constructor that gets the starting balance of the card as parameter.
//        The card saves the balance in the object variable balance. Implement also the toString method that returns a string of the form "The card has X euros".
        LyyraCard card = new LyyraCard(50);
        System.out.println(card);

//        Exercise 77.2: Paying with card
//        Implement the following methods to LyyraCard:
//        Method payEconomical should decrease the balance by 2.50 euros and method payGourmet by 4.00 euros.4
        card.payEconomical();
        System.out.println(card);
        card.payGourmet();
        card.payEconomical();
        System.out.println(card);

//        Exercise 77.3: Balance nonnegative
//        Change methods payEconomical and payGourmet so that if there is not enought money, the balance does not change.
        LyyraCard enough = new LyyraCard(5);
        System.out.println(enough);

        enough.payGourmet();
        System.out.println(enough);

        enough.payGourmet();
        System.out.println(enough);

//        Exercise 77.4: Loading money to card
//        The method should increase the balance of the card by the given amount.
//        However, the maximum balance on a card is 150 euros.
//        In case the balance after loading money would be more than that, it should be truncated to 150 euros.
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);

//        Exercise 77.5: Loading a negative amount
//        Change the method loadMoney so that the balance of the card does not change if the amount to load is negative.
        System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);

//        Exercise 77.6: Multiple cards
//        Write a main method that does the following:
//        Creates a LyyraCard for Pekka with initial balance of 20 euros
//        Creates a LyyraCard for Brian with initial balance of 30 euros
//        Pekka buys gourmet lunch
//        Brian buys economical lunch
//        cards are printed (both on their own row, starting with the name of the card owner)
//        Pekka loads 20 euros
//        Brian buys gourmet lunch
//        cards are printed (both on their own row, starting with the name of the card owner)
//        Pekka buys economical lunch
//        Pekka buys economical lunch
//        Brian loads 50 euros
//        cards are printed (both on their own row, starting with the name of the card owner)
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
        }
}
