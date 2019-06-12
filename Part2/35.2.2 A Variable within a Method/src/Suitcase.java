import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private int currentWeight;
    private static ArrayList<Thing> things = new ArrayList<Thing>();
    private Thing heaviestThing;

    public Suitcase(int max_weight) {
        this.maxWeight = max_weight;
        this.currentWeight = 0;
    }

    public void addThing(Thing thing){
        heaviestThing = thing;
        if(thing.getWeight() + this.currentWeight <= this.maxWeight){
            this.things.add(thing);
            this.currentWeight += thing.getWeight();
        }
    }

    public String toString(){
        if(things.size() < 1){
            return "empty " + "(" + this.currentWeight + " kg)";
        }
        return things.size() + " things " + "(" + this.currentWeight + " kg)";
    }

    public static void printThings() {
        for(int i = 0; i < things.size(); i++){
            System.out.println(things.get(i));
        }
    }

    public int currentWeight() {
        return this.currentWeight;
    }

    public Thing heaviestThing() {
        if(things.size() < 1){
            return null;
        }
        return this.heaviestThing;
    }
}
