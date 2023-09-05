package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Итератор для Класса StudentSteam
 */
public class SteamIterator implements Iterator<StudentGroup> {
    private int count;
    private final List<StudentGroup> steam;

    public SteamIterator(List<StudentGroup> group) {
        this.steam = group;
    }

    @Override
    public boolean hasNext() {
        return count < steam.size();
    }

    @Override
    public StudentGroup next() {
        count++;
        return steam.get(count - 1);
    }

}
