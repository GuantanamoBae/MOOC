public class Student {
    private String name;
    private String ID;

    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName(){
        return this.name;
    }

    public String getStudentNumber(){
        return this.ID;
    }

    public String toString(){
        return getName() + " (" + getStudentNumber() + ")";
    }
}
