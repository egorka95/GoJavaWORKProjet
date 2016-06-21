package Modul8.Task2;

import java.util.Comparator;



public class PianoNameComparator implements Comparator<Piano> {


    @Override
    public int compare(Piano piano1,Piano piano2) {
        return piano1.getName().compareTo(piano2.getName());
    }



}
