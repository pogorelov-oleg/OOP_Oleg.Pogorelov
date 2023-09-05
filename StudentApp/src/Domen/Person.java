package Domen;

/**
 * Абстрактный класс - шаблон для человека. Содержит донные о его имени и возрасте
 */
public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Вывозит информацию о человеке (Имя, возраст)
     */
    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + "]";
    }

}