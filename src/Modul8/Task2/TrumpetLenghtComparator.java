package Modul8.Task2;

import java.util.Comparator;

/**
 * Created by nikitarozhkov on 21.06.16.
 */
public class TrumpetLenghtComparator implements Comparator<Trumpet> {

    @Override
    public int compare(Trumpet trumpet1, Trumpet trumpet2) {
        Integer lenght1 = new Integer(trumpet1.getLenght());
        Integer lenght2 = new Integer(trumpet2.getLenght());
        return lenght1.compareTo(lenght2);
    }
}
