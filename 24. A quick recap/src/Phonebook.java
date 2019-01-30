import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phoneBook;

    public Phonebook() {
        this.phoneBook = new ArrayList<Person>();
    }

    public void add(String name, String number){
        Person adder = new Person (name, number);
        phoneBook.add(adder);
    }

    public void printAll(){
        for(int i = 0; i < phoneBook.size(); i++){
            System.out.println(phoneBook.get(i));
        }
    }

    public String searchNumber(String name){
        for (Person person : phoneBook) {
            if (person.getName().contains(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
