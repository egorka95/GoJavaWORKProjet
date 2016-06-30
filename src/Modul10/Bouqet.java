package Modul10;

import java.util.List;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class Bouqet  implements Comparable<Bouqet> {

    List<Flower> flowers;
    String type;
    int size;

    private String name;

    @Override
    public String toString() {
        return "Bouqet{" +
                "name='" + name + '\'' +
                '}';
    }

    public Bouqet(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






    public int compareTo(Bouqet bouqet) {
       return this.name.compareTo(bouqet.getName());
    }
}
