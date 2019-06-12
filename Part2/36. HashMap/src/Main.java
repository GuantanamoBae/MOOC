import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();
        dict.add("que", "what");

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}
