package Modul6.Task4;



/**
 * Created by nikitarozhkov on 08.06.16.
 */
public class ArraySortTools {



    public static int[] bubbleSort(int[] mas) {

        int[] resMas = mas;
        for (int i = 0; i < resMas.length - 1; i++)
        {
            for (int j = 0; j < resMas.length - 1; j++)
            {
                if (resMas[j] > resMas[j + 1])
                {
                    int temp = resMas[j];
                    resMas[j] = resMas[j + 1];
                    resMas [j + 1] = temp;
                }
            }

        }
        return resMas;
    }

    public static int minElement(int[] mas) throws ArrayIndexOutOfBoundsException {
        int min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }

        return min;

    }

    public static int maxElement(int[] mas) throws  ArrayIndexOutOfBoundsException {
        int max = mas[0];
        

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }

        return max;


    }
}