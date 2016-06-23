package Modul6.Task3;

public class Main {

    public static void main(String[] args) {

        /*

        Magic Numbers && Hard code.

         */

        Dote dote1 = new Dote(2,3);
        Dote dote2 = new Dote(4, 4);
        try {
            dote1.calculator(dote2);
        }catch (NumberFormatException e){
            System.out.println("Друг мой ты где то явно накосячил");
        }

    }
}
