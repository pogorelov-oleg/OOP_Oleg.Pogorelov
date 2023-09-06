package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс описывает группу. Содержит список учеников,номер группы и колличество
 * учеников
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> group;
    private int idGroup;
    private int groupSize;

    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
        this.groupSize = group.size();
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getGroupSize() {
        return groupSize;
    }

    /**
     * Вывозит информацию о группе (Номер группы, колличество учеников)
     */
    @Override
    public String toString() {
        String studentsOut = "\u001B[32mStudentGroup = " + idGroup + ", Колличество учеников = " + groupSize
                + "\u001B[0m\n";
        for (Student student : group) {
            studentsOut += student + "\n";

        }
        return studentsOut;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.idGroup == o.idGroup) {
            return 0;
        } else if (this.idGroup > o.idGroup) {
            return 1;
        } else
            return -1;
    }

}