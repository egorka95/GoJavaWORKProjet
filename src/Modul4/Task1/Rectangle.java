package Modul4.Task1;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
 class Rectangle implements Figure {

    public double x;
    public double y;




    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double sum() {
        return x * y;
    }
}