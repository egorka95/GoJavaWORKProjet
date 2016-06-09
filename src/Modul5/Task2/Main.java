package Modul5.Task2;

/**
 * Created by nikitarozhkov on 09.06.16.
 */
public class Main {
    public static void main(String[] args) {
        // я решил сделать масив который сам генерирует числа
        // я думаю так интересней
        int []mas = new int[10];
        for( int i = 0; i < mas.length; i++){
            mas[i] = (int) Math.round( Math.random()*100);
            System.out.println(mas[i] + " ");
        }


        System.out.println(ArraySortTools.minElement(mas));
        System.out.println(ArraySortTools.maxElement(mas));
        System.out.println(ArraySortTools.bubbleSort(mas));
    }
}
