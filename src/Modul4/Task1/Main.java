package Modul4.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Main {


    public static void main(String[] args) {
        Figure rectangle = new Rectangle(3,4);
        System.out.println(rectangle.sum());

        Figure circle = new Circle(4);
        System.out.println(circle.sum());

        Figure traingle = new Traingle(3,4);
        System.out.println(traingle.sum());

    }
}
