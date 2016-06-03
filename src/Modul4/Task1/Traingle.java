package Modul4.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Traingle implements Figure {

    double x;
    double y;

    public Traingle(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return (0.5 * x) * y;
    }
}
