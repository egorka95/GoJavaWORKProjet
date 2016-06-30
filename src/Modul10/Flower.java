package Modul10;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class Flower {

    static final String fileWithEncryptInformation = "secretInformatiom";


    public static void main(String[] args) throws IOException {

        ArrayList<Bouqet> bouqets = new ArrayList();

        Bouqet flower1 = new Bouqet("red");
        Bouqet flower2 = new Bouqet("blue");
        Bouqet flower3 = new Bouqet("green");
        Bouqet flower4 = new Bouqet("gold");
        Bouqet flower5 = new Bouqet("noname");

        bouqets.add(flower1);
        bouqets.add(flower2);
        bouqets.add(flower3);
        bouqets.add(flower4);
        bouqets.add(flower5);


       /* Iterator<Bouqet> iterator = bouqets.iterator();
        while (iterator.hasNext()) {
            Bouqet bouqet = iterator.next();
            System.out.print(bouqet.getName() + " ");


        }*/
        for (Bouqet bouqet1 : bouqets) {
            System.out.println(bouqet1);
        }

        EnglishCesar englishCesar = new EnglishCesar();


        String encryptBouqet = englishCesar.encrypt(flower1,2,2);

        System.out.println(encryptBouqet);

       /* String desBouqet = englishCesar.decrypt(encryptBouqet, 2, 2);

        System.out.println(desBouqet);

*/
        DataInputStream inputStream = null;

        try {
            DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileWithEncryptInformation)));
            {
                outputStream.writeUTF(String.valueOf(flower1));

            }

            outputStream.close();


            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileWithEncryptInformation)));
            while (true) {

                String flower = inputStream.readUTF();
                System.out.println(flower);

            }


        } catch (EOFException e) {
            System.out.println("Reaches out of file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }


            }


        }
    public String color;
    public int size;


    public Flower(String color) {

        this.color = color;
        this.size = size;
    }
}