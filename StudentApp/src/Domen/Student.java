package Domen;

/**
 * Дочерний класс класса Person. Описывает студента. Добавлено поле id (id
 * студента), generalId (статический счетчик id)
 */
public class Student extends Person implements Comparable<Student> {

    private int id;
    private static int generalId;

    public Student(String name, int age) {
        super(name, age);
        generalId++; // сначала плюсую и ниже присваиваю, чтобы индексация шла с единицы, а не с нуля
        this.id = generalId;
    }

    public int getId() {
        return id;
    }

    /**
     * Вывозит информацию о студенте (Имя, возраст, id)
     */
    @Override
    public String toString() {
        return "Student [name = " + super.getName() + ", age = " + super.getAge() + ", id = " + id + "]";
    }

    /**
     * описывает сортировку
     */
    @Override
    public int compareTo(Student o) {

        if (super.getAge() == o.getAge()) {
            return 0;
        } else if (super.getAge() > o.getAge()) {
            return 1;
        } else
            return -1;
    }

}
