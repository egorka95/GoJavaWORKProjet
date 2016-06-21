package Modul8.Task2;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class Guitar implements Comparable<Guitar> {
    private String name;
    private String characteristic;
    private int weight;

    public Guitar(String name, int weight, String characteristic) {
        this.characteristic = characteristic;
        this.name = name;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "Guitar{" +
                "название='" + name + '\'' +
                ", характеристика='" + characteristic + '\'' +
                ", вес=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guitar)) return false;

        Guitar guitar = (Guitar) o;

        if (weight != guitar.weight) return false;
        if (!name.equals(guitar.name)) return false;
        return characteristic.equals(guitar.characteristic);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + characteristic.hashCode();
        result = 31 * result + weight;
        return result;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Guitar guitar) {
        return this.name.compareTo(guitar.getName());
    }
}
