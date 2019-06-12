public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick(){
        if (this.seconds.getValue() == 59) {
            this.seconds.setValue(0);
            if(this.minutes.getValue() == 59){
                this.minutes.setValue(0);
                if(this.hours.getValue() == 23){
                    this.hours.setValue(0);
                }
                this.hours.next();
            }
            this.minutes.next();
        }
        this.seconds.next();
    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
