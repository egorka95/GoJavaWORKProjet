package Modul4.Task3;

public class Main {

    public static void main(String[] args) {
        Dote dote1 = new Dote(2, 2);
        Dote dote2 = new Dote(4, 4);
        System.out.println(Calculator.calculateDote(dote1, dote2));
    }
}
