package Modul6.Task1.Task2;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Temperature {
    public double Celsius(double x) {
        try {
            return Double.parseDouble(null);
        }
        catch (NullPointerException e) {
            System.out.println("перемееная не можеть быть ровна 'null'");
        }

        return x;
    }
    public double F(double x){
        return (x - 32) * 1.8;
    }
}
