public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        if(this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment){
        int calc = ((otherApartment.pricePerSquareMeter * otherApartment.squareMeters) - (squareMeters * pricePerSquareMeter));
        if(calc < 0){
            calc = calc * -1;
        }
        return calc;
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        int other = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
        int first = squareMeters * pricePerSquareMeter;
        if(first > other){
            return true;
        }
        return false;
    }
}