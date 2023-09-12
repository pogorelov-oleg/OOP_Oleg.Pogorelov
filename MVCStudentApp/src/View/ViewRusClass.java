package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewRusClass implements iGetView {
    private HashMap<String, String> language = new HashMap<>();

    public ViewRusClass() {
        this.language.put("msgInputCommand",
                "\u001B[33mВведите команду:\u001B[0m\nLIST - Показать список студентов\nDELETE - Удалить студента из списка\nEXIT - Выйти из программы");
        this.language.put("msgExit", "\u001B[33mВыход из программы\u001B[0m");
        this.language.put("msgSelectStudentToDelete", "\u001B[33mВведите ID студента для удаления:\u001B[0m");
        this.language.put("msgListIsEmpty", "\u001B[31mСписок студентов пуст\u001B[0m");
        this.language.put("msgIncorrectData", "\u001B[31mВы ввели некорректные данные\u001B[0m");
        this.language.put("msgIsNotInTheList", "\u001B[31mСтудент с таким ID отсутствует в списке\u001B[0m");
        this.language.put("msgDeleted", ":\u001B[31m УДАЛЕН\u001B[0m");
        this.language.put("msgModel", "\u001B[32m Модель\u001B[0m");

    }

    public void printAllStudent(List<Student> students) {
        System.out.println("\u001B[32m----------- Список студентов -----------\u001B[0m");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("\u001B[32m----------------------------------------\u001B[0m");
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();

    }

    public HashMap<String, String> getLanguage() {
        return language;
    }

}