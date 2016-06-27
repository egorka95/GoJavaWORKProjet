package Modul3.HomeWorkModul3Task1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class Flower {



    public static void main(String[] args) {

        ArrayList<Bouqet> bouqets = new ArrayList();

        Bouqet flower1 = new Bouqet("red");
        Bouqet flower2 = new Bouqet("blue");
        Bouqet flower3 = new Bouqet("green");
        Bouqet flower4 = new Bouqet("gold");

        bouqets.add(flower1);
        bouqets.add(flower2);
        bouqets.add(flower3);
        bouqets.add(flower4);



        Iterator<Bouqet> iterator = bouqets.iterator();
        while (iterator.hasNext()){
            Bouqet bouqet =  iterator.next();
            System.out.print(bouqet.getName() + " ");



        }
        for (Bouqet bouqet1 : bouqets){
            System.out.println(bouqet1);
        }

        EnglishCesar englishCesar = new EnglishCesar();

        String encryptBouqet = englishCesar.encrypt(flower1,2,2);

        System.out.println(encryptBouqet);

        String desBouqet = englishCesar.decrypt(encryptBouqet,2,2);

        System.out.println(desBouqet);







    }


    public String color;
    public int size;


    public Flower(String color){

       this.color = color;
       this.size = size;
    }



}
