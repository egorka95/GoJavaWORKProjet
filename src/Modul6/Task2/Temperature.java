package Modul6.Task2;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Temperature {
    public double Celsius(double x) {
       double temperatura = (x * 1.8) + 32;
        if (x < 399){

            throw new IllegalArgumentException("Некоректные данные");

            }
        else
            return temperatura;
    }
    public double F(double x){
        double temperatura = (x - 32) * 1.8;
        if (x < -399)
        {
            throw new IllegalArgumentException("некоректные данные");
        }else
        {
        return temperatura;
    }
}}
