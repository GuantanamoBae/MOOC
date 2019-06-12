public class DecreasingCounter {
    private int value;
    private int initial;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial =valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if(value > 0){
            value--;
        }
    }

    public void reset(){
        value = 0;
    }

    public void setInitial(){
        value = initial;
    }
}
