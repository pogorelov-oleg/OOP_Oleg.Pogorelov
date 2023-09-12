package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Core.Student;

/**
 * Интерфейс для работы с View
 */
public interface iGetView {
    /**
     * Выводит в консоль список студентов
     * 
     * @param students список студентов
     */
    void printAllStudent(List<Student> students);

    /**
     * Выодит сообщение в консоль и запрашивает данные. Далее их возвращает
     * 
     * @param msg текстовое сообщение
     * @return возвращает введенные пользователем данные
     */
    String prompt(String msg);

    /**
     * @return возвращает словарь из фраз для меню
     */
    public HashMap<String, String> getLanguage();

}