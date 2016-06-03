package Modul4.Task3;

/**
 * Created by nikitarozhkov on 03.06.16.
 */
public class Calculator {
    public static double calculateDote(Dote dote1, Dote dote2)
    {
        return Math.sqrt(Math.pow((dote1.getX() - dote2.getX()), 2) + Math.pow((dote1.getY() - dote2.getY()), 2));
    }
}
