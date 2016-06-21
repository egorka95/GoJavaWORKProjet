package Modul8.Task2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class MusicInstruments {


    public static void main(String[] args) {


        ArrayList<Piano> pianos = new ArrayList();
        {

            Piano piano1 = new Piano("Ghonson", 2, "Хорошее пианино, вот прям честно");
            Piano piano2 = new Piano("Amber", 4, "еще лучше");
            Piano piano3 = new Piano("Yamaha", 7, "Самое лучшее, что было в магазине");

            pianos.add(piano1);
            pianos.add(piano2);
            pianos.add(piano3);

            //создал свой лычный сортировщик
            //тут он сортирует по нужному мне критерию НАЗВАНИЮ инструмента
            Collections.sort(pianos, new PianoNameComparator());


            for (Piano piano : pianos) {
                System.out.println(piano);
            }
        }


        System.out.println(" ");

        ArrayList<Guitar> guitars = new ArrayList();{

        Guitar guitar1 = new Guitar("Yamaha",500,"Звучит хорошо");
        Guitar guitar2 = new Guitar("Kort",600,"На любителя");
        Guitar guitar3 = new Guitar("Vapiano",567,"Цена = качество");

        guitars.add(guitar1);
        guitars.add(guitar2);
        guitars.add(guitar3);

            //создал свой лычный сортировщик
            //тут он сортирует по нужному мне критерию ВЕСУ инструмента
            Collections.sort(guitars, new GuitarWeightComparator());

        for (Guitar guitar : guitars) {
            System.out.println(guitar);
        }
            System.out.println(" ");

            ArrayList<Trumpet> trumpets = new ArrayList();

            Trumpet trumpet1 = new Trumpet("Yamaha", 37);
            Trumpet trumpet2 = new Trumpet("Yamaha", 54);
            Trumpet trumpet3 = new Trumpet("Yamaha", 41);

            trumpets.add(trumpet1);
            trumpets.add(trumpet2);
            trumpets.add(trumpet3);

            //создал свой лычный сортировщик
            //тут он сортирует по нужному мне критерию ДЛИННЕ инструмента
            Collections.sort(trumpets, new TrumpetLenghtComparator());

            for (Trumpet trumpet : trumpets){
                System.out.println(trumpet);
            }
        }
        }










}
