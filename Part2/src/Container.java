import java.util.ArrayList;

public class Container {

    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> luggage = new ArrayList<>();

    public Container(int max){
        this.maxWeight = max;
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(this.currentWeight + suitcase.currentWeight() <= this.maxWeight){
            luggage.add(suitcase);
            this.currentWeight += suitcase.currentWeight();
        }
    }

    public String toString(){
        return luggage.size() + " suitcases " + "(" + this.currentWeight + " kg)";
    }

    public void printThings() {
        for(int i = 0; i < luggage.size(); i++){
            Suitcase.printThings();
        }
    }
}
