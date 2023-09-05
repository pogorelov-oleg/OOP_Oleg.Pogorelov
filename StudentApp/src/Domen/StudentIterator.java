package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор для класса StudentGroup 
 */
public class StudentIterator implements Iterator<Student> {
    private int count;
    private final List<Student> group;

    public StudentIterator(List<Student> group) {
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return count < group.size();
    }

    @Override
    public Student next() {
        count++;
        return group.get(count - 1);
    }

}
