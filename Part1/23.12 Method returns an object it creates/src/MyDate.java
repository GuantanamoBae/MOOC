public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        // first we'll compare years
        if ( this.year < compared.year ) {
            return true;
        }

        // if the years are the same, we'll compare the months
        if ( this.year == compared.year && this.month < compared.month ) {
            return true;
        }

        // years and months the same, we'll compare the days
        if ( this.year == compared.year && this.month == compared.month &&
                this.day < compared.day ) {
            return true;
        }

        return false;
    }

    public void advance(){
        if(this.day == 30) {
            this.day = 0;
            if(this.month == 12){
                this.month = 0;
                this.year++;
            }
            this.month++;
        }
        this.day++;
    }

    public void advance(int numberOfDays){
        int count = 0;
        while(count < numberOfDays){
            advance();
            count++;
        }
    }

    public MyDate afterNumberOfDays(int days){
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        newMyDate.advance(days);
        return newMyDate;
    }

    public int differenceInYears(MyDate comparedDate) {
        int first = this.day + this.month * 30 + this.year * 12 * 30;
        int second = comparedDate.day + comparedDate.month * 30 + comparedDate.year * 12 * 30;
        int count = first - second;
        if(count < 0){
            count *= -1;
        }
        return count / 360;
    }
}
