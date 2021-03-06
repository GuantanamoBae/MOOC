import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Exercise 88.1: Class Student
//        Implement class Student that holds the following information about a student:
//        name (String)
//        studentNumber (String)
//        The class should have the following methods:
//        A constructor that initializes the name and the student number with the given parameters.
//        getName, that returns the student name
//        getStudentNumber, that returns the student number
//        toString, that returns a String representation of the form: Pekka Mikkola (013141590)
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);

//        Exercise 88.2: List of students
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("Name: ");
            String name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("Student Number: ");
            String Id = reader.nextLine();
            Student adder = new Student(name, Id);
            list.add(adder);
        }
        for(Student i : list){
            System.out.println(i);
        }

//        Exercise 88.3: Search
//        Extend the program of the previous part so that after the student info has been entered and students printed,
//                the user can search the student list based on a given search term.
        System.out.println("Given Search Term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");
        for(Student i : list){
            if(search.contains(i.getName())){
                System.out.println(i);
            }
        }


    }
}
