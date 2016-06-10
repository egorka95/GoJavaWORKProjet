package Modul6.Task1.Task2;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Main {
    public static void main(String[] args) {

        Temperature calc1 = null;
        Temperature calc = new Temperature();
        System.out.println(calc.Celsius(20));
        System.out.println(calc.F(32));
       try {
           System.out.println(calc1.Celsius(20));
       }catch (NullPointerException e){
           System.out.println("Не правильное использование метода, calc1 = " + calc1);
       }
    }
    }

