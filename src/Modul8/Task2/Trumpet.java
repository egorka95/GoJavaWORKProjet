package Modul8.Task2;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class Trumpet implements Comparable<Trumpet> {

    private  String name;
    private  int lenght;

    public Trumpet(String name, int lenght) {

        this.lenght = lenght;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "название='" + name + '\'' +
                ", длинна=" + lenght +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trumpet)) return false;

        Trumpet trumpet = (Trumpet) o;

        if (lenght != trumpet.lenght) return false;
        return name.equals(trumpet.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lenght;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int compareTo(Trumpet trumpet) {
        return this.name.compareTo(trumpet.getName());
    }
}
