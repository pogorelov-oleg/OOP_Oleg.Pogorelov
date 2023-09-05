package Domen;

/**
 * Дочерний класс класса Person. Описывает сотрудника Добавлено поле special (должность)
 */
public class Employee extends Person {
    private String special;

    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
}