package Modul5.Task2;

import static java.lang.System.*;

/**
 * Created by nikitarozhkov on 09.06.16.
 */
public class Main {
    public static void main(String[] args) {

        /*

        Magic Numbers && Hard code.

         */

        // я решил сделать масив который сам генерирует числа
        // я думаю так интересней
        int []mas = new int[10];
        for( int i = 0; i < mas.length; i++){
            mas[i] = (int) Math.round( Math.random()*100);
            out.print(mas[i] + " ");}
        System.out.println(" ");

        int[] sortedTools = ArraySortTools.bubbleSort(mas);
        for (int i = 0; i < sortedTools.length; i++)
        {
            System.out.print(sortedTools[i] + " ");
        }


        System.out.println(" ");
        System.out.println(ArraySortTools.minElement(mas));
        System.out.println(ArraySortTools.maxElement(mas));
    }

}
