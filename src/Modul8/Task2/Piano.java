package Modul8.Task2;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class Piano implements Comparable<Piano> {

    private String name;
    private String characteristic;
    private int size;

    @Override
    public String toString() {
        return "Piano{" +
                "название='" + name + '\'' +
                ", характеристика='" + characteristic + '\'' +
                ", размер в м2=" + size +
                '}';
    }

    public Piano(String name, int size, String characteristic) {
        this.name = name;
        this.size = size;
        this.characteristic = characteristic;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Piano)) return false;

        Piano piano = (Piano) o;

        if (size != piano.size) return false;
        if (!name.equals(piano.name)) return false;
        return characteristic.equals(piano.characteristic);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + characteristic.hashCode();
        result = 31 * result + size;
        return result;
    }

    @Override
    public int compareTo(Piano piano) {
        return this.name.compareTo(piano.getName());
    }
}


