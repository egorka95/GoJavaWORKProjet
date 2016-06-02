package Modul4.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Circle implements Figure {


    public double x;

    public  Circle(double x){
        this.x=x;

    }

    @Override
    public double sum() {
        return 3.14 * (this.x * this.x);
    }
}
