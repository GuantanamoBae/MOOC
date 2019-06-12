public class Counter {

    private int start;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.start = startingValue;
        this.check = check;
    }
    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }

    public int value(){
        return this.start;
    }

    public void increase(){
        this.start++;
    }

    public void decrease(){
        if(this.check == true){
            if(this.start >= 1){
                this.start--;
            }
        }
        else if(this.check == false){
            this.start--;
        }
    }

    public void increase(int increaseAmount){
        if(increaseAmount <= 0){
            return;
        }
        start += increaseAmount;
    }

    public void decrease(int decreaseAmount){
        if(decreaseAmount < 0){
            return;
        }
        if(start - decreaseAmount < 0){
            check = false;
            this.start = 0;
        }
        start -= decreaseAmount;
    }
}
