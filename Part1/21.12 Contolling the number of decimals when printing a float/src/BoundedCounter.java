public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        if(value >= upperLimit){
            value = 0;
        }
        else {
            value++;
        }
    }

    public String toString() {
        if(value >= 10){
        return "" + value;
        }
        else{
            return "" + 0 + value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int init){
        if(init < 0 || init > upperLimit){
            return;
        }
        else{
            value = init;
        }
    }
}
