package Modul5.Task2;



/**
 * Created by nikitarozhkov on 08.06.16.
 */
public class ArraySortTools {
    private int[] mas;


    public static int[] bubbleSort(int[] mas) {

        int[] resMas = mas;

        for (int i = 1; i < resMas.length; i++) {
            for (int j = resMas.length; j >= i; j--) {
                if (resMas[j - 1] > resMas[j]) {
                    int temp = resMas[j - 1];
                    mas[j - 1] = resMas[j];
                    resMas[j] = temp;
                }
            }
        }

        return resMas;
    }

    public static int minElement(int[] mas) {
        int min = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }

        return min;

    }

    public static int maxElement(int[] mas) {
        int max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }

        return max;


    }
}