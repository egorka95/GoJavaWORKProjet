package Modul8.Task2;

import java.util.Comparator;

/**
 * Created by nikitarozhkov on 21.06.16.
 */
public class GuitarWeightComparator implements Comparator<Guitar> {

    @Override
    public int compare(Guitar guitar1, Guitar guitar2) {
        Integer weight1 = new Integer(guitar1.getWeight());
        Integer weight2 = new Integer(guitar2.getWeight());
        return weight1.compareTo(weight2);
    }
}
