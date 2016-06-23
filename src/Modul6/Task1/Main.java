package Modul6.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Main {


    public static void main(String[] args) {

        /*

        Magic Numbers && Hard code.

         */

        Figure rectangle = new Rectangle(-3,4);
        try {System.out.println(rectangle.area());}
        catch (IllegalArgumentException e){
            System.out.println("Числа не должны быть отрицательными");
        }

        Figure circle = new Circle(-182);
        try{
        System.out.println(circle.area());}
        catch (IllegalArgumentException e){
            System.out.println("Число не должно быть отрицательным");
        }

        Figure traingle = new Traingle(3,4);
        try {
            System.out.println(traingle.area());
        }catch (IllegalArgumentException e){
            System.out.println("Числа не должны быть отрицательными");
        }
    }
}
