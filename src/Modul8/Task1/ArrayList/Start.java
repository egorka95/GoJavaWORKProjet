package Modul8.Task1.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Start {
    public static void main(String[] args) {




        ArrayList<Car> cars = new ArrayList();//колекию надо инициализировать

        Car car1 = new Car("bmw",2001);
        Car car2 = new Car("mers", 2012);
        Car car3 = new Car("toyota", 1987);
        Car car4 = new Car("volvo", 2016);
        Car car5 = new Car("volvo", 2003);
        Car car6 = new Car("astra", 2010);


            cars.add(car1);
            cars.add(car2);
            cars.add(car3);
            cars.add(car4);
            cars.add(car5);
            cars.add(car6);




        //это несколько видов сортировки, первая через утил
        //

        //Collections.sort(cars);

        //Collections.sort(cars, new CarNameComparator());

        //Collections.sort(cars, new CarYearComparator());

        for (Car car : cars){
            System.out.println(car);
        }


            /*Iterator<Car> iterator = cars.iterator();//это я тут эксперементировал
                                                        //с разными системами выводв
            while (iterator.hasNext()){
                Car car =  iterator.next();
                System.out.print(car.getName() + " ");
                System.out.println(car.getYear());
            }*/
        }
    }

