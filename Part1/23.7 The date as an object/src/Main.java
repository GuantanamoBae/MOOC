public class Main {

    public static void main(String[] args) {
//        Exercise 87.1: Larger
//        Implement the method public boolean larger(Apartment otherApartment) that returns true if the Apartment object for
//        which the method is called (this) is larger than the apartment object given as parameter (otherApartment).
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true

//        Exercise 87.2: Price difference
//        Implement the method public int priceDifference(Apartment otherApartment) that returns the absolute value of the price difference of the Apartment object for
//        which the method is called (this) and the apartment object given as parameter (otherApartment). The price of an apartment is squareMeters * pricePerSquareMeter.
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400


//    Exercise 87.3: more expensive than
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));       // false
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));   // true
    }
}
