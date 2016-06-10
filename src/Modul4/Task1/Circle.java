package Modul4.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Circle implements Figure {


    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public  Circle(double x){
        this.x=x;


    }

    @Override
    public double area() {
        if (x < 0 )throw new  IllegalArgumentException();
        return 3.14 * (this.x * this.x);
    }
}
