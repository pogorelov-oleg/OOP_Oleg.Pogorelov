package Controllers;

import java.util.List;

import Domen.Person;
import Domen.Teacher;

public class AccountController {

    /**
     * Начисляет зарплату (в данном случае просто выводит сообщение об этом в
     * консоль)
     * 
     * @param <T>    дженерик тип (в данном случае принимает либо преподавателя,
     *               либо сотрудника)
     * @param person принимает экземпляр дженерик типа
     * @param salary сумма зарплаты
     */
    public static <T extends Teacher, Employee> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    /**
     * 
     * @param <T>     дженерик тип (в данном случае принимает любой тип класса
     *                Person)
     * @param persons принимает список экземпляров дженерик типа
     * @return возвращает средний возраст людей из списка
     */
    public static <T extends Person> double averageAge(List<T> persons) {
        double sum = 0.0;
        for (T person : persons) {
            sum += person.getAge();
        }
        return sum / persons.size();
    }

}