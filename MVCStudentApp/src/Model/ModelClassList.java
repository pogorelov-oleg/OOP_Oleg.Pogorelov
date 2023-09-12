package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

/**
 * Модель хранит список студентов с словаре (ключ - ID, )
 */
public class ModelClassList implements iGetModel {

    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Удаляет студента из списка
     * 
     * @param index индекс студента для удаления
     */
    @Override
    public void removeStudent(int index) {
        this.students.remove(index);
    }

}
