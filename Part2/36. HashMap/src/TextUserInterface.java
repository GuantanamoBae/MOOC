import java.util.Scanner;

public class TextUserInterface {

    private Scanner input;
    private Dictionary dic;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.input = reader;
        this.dic = dictionary;
    }

    public void start(){
        while(true) {
            System.out.println("Statement: ");
            String givin = this.input.nextLine();
            clean(givin);

            if(givin.equals("quit")){
                System.out.println("Cheese!");
                break;
            }
            if(givin.equals("add")){
                add();
            }
            if(givin.equals("translate")){
                translate();
            }
            else{
                System.out.println("Unknown Statement");
            }
        }
    }

    private String clean(String givin) {
        givin.toLowerCase();
        givin.trim();
        return givin;
    }

    private void translate() {
        System.out.println("Enter Word To Be Translated");
        String trans = this.input.nextLine();
        clean(trans);
        System.out.print(trans + " = " + dic.translate(trans));
    }

    private void add() {
        System.out.println("Enter Non-English Word");
        String english = this.input.nextLine();
        clean(english);
        System.out.println("Enter English Translation");
        String nonEnglish = this.input.nextLine();
        clean(nonEnglish);
        dic.add(nonEnglish, english);
        System.out.println("Translation Added Successfully");
    }
}
