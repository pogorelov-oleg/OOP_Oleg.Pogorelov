import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        // Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Сергей", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Ксения", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);
        Student s7 = new Student("Аристарх", 38);
        Student s8 = new Student("Махмуд", 24);
        Student s9 = new Student("Иван", 22);
        Student s10 = new Student("Тамара", 23);
        Student s11 = new Student("Натик", 22);
        Student s12 = new Student("Светлана", 23);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s6);
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s10);
        listStud3.add(s11);
        listStud3.add(s12);

        StudentGroup group5123 = new StudentGroup(listStud1, 5123);
        StudentGroup group5134 = new StudentGroup(listStud2, 5134);
        StudentGroup group5155 = new StudentGroup(listStud3, 5155);

        List<StudentGroup> steam1 = new ArrayList<StudentGroup>();
        steam1.add(group5123);
        steam1.add(group5134);
        steam1.add(group5155);

        StudentSteam steam2023 = new StudentSteam(steam1, 2023);
        Collections.sort(steam2023.getSteam());
        System.out.println(steam2023);

        // Урок 4. ООП: Обобщения. ч1

        Teacher t1 = new Teacher("Галина", 55, "Академик");
        Teacher t2 = new Teacher("Татьяна", 47, "Член-корр.");
        Teacher t3 = new Teacher("Сергей", 57, "Доцент");
        Teacher t4 = new Teacher("Михаил", 63, "Профессор");

        List<Teacher> listTeach1 = new ArrayList<Teacher>();
        listTeach1.add(t1);
        listTeach1.add(t2);
        listTeach1.add(t3);
        listTeach1.add(t4);

        AccountController.paySalary(t1, 50000);

        System.out.println("Средний возраст учеников группы 5123: " + AccountController.averageAge(listStud1));
        System.out.println("Средний возраст учеников группы 5134: " + AccountController.averageAge(listStud2));
        System.out.println("Средний возраст учеников группы 5155: " + AccountController.averageAge(listStud3));
        System.out.println("Средний возраст преподавателей: " + AccountController.averageAge(listTeach1));

    }

}
