package Model;

import Controller.Interfaces.iGetModel;
import Model.Core.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Модель хранит список студентов в словаре (ключ - ID, значение - экземпяр
 * класса Student)
 */
public class ModelClassHash implements iGetModel {
    /**
     * Словарь студентов (ключ - ID, значение - экземпяр класса Student)
     */
    private HashMap<Long, Student> students;

    /**
     * Конструктор создает словарь
     * 
     * @param studentList принимает список студентов и создает из него словарь
     *                    студентов
     */
    public ModelClassHash(List<Student> studentList) {
        this.students = new HashMap<Long, Student>();
        for (Student student : studentList) {
            this.students.put(((long) student.getId()), student);
        }
    }

    /**
     * Возвращает копию(!) списка студентов ()
     */
    @Override
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        students.forEach((k, v) -> {
            studentList.add(v);
        });
        return studentList;
    }

    /**
     * Удаляет студента из списка
     * 
     * @param index индекс студента для удаления
     */
    @Override
    public void removeStudent(int index) {
        List<Student> studentList = getStudents();
        studentList.remove(index);

        this.students = new HashMap<Long, Student>();
        for (Student student : studentList) {
            this.students.put(((long) student.getId()), student);
        }

    }
}