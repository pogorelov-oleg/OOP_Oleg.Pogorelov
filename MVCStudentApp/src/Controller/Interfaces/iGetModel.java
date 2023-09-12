package Controller.Interfaces;

import java.util.List;

import Model.Core.Student;

/**
 * Интерфейс для работы с Model
 */
public interface iGetModel {
    /**
     * Возвращает список студентов
     * 
     * @return
     */
    public List<Student> getStudents();

    /**
     * Удаляет студента из списка
     * 
     * @param index индекс студента для удаления
     */
    public void removeStudent(int index);

}