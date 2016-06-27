package Modul3.HomeWorkModul3Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class Bouqet extends Flower {

    List<Flower> flowers;
    String name;
    String type;
    int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Bouqet(String color ) {
        super(color);
    }

    public int compareTo(Bouqet bouqet) {
       return this.name.compareTo(bouqet.getName());
    }
}
