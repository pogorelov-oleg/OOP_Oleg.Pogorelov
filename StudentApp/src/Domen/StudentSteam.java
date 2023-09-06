package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс описывает поток. Содержит список групп,номер потока и колличество групп
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> steam;
    private int idSteam;
    private int steamSize;

    public StudentSteam(List<StudentGroup> steam, int idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
        this.steamSize = steam.size();
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setGroup(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public int getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(int idSteam) {
        this.idSteam = idSteam;
    }

    public int getSteamSize() {
        return steamSize;
    }

    /**
     * Вывозит информацию о потоке (Номер потока, колличество групп)
     */
    @Override
    public String toString() {
        String groupsOut = "\u001B[36m\nНомер потока:" + idSteam + ", Колличество групп = " + steamSize + "\u001B[0m\n\n";
        for (StudentGroup group : steam) {
            groupsOut += group + "\n";

        }
        return groupsOut;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new SteamIterator(steam);
    }

}