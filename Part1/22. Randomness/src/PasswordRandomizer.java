import java.util.Random;

public class PasswordRandomizer {
    private int size;
    private int start;


    public PasswordRandomizer(int length) {
        this.size = length;
    }

    public String createPassword() {
        Random number = new Random();
        String password = "";
        this.start = 0;
        while (start < size){
            int i = number.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(i);
            password += symbol;
            start++;
        }
        return password;
    }
}