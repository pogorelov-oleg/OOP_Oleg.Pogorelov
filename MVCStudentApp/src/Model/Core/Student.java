package Model.Core;
/**
 * 
 */
public class Student extends Person {
    private int id;
    private static int generalId;

    public Student(String name, int age) {
        super(name, age);
        generalId++;
        this.id = generalId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }
}