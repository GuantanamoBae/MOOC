import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random draw = new Random();

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        int i = 0;
        while(i < 7) {
            containsNumber(this.draw.nextInt(100));
            i++;
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        if(!numbers.contains(number)){
            numbers.add(number);
            return true;
        }
        else {
            return false;
        }
    }
}