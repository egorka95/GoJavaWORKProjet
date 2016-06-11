package Modul6.Task4;

import static java.lang.System.out;

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
       try{
        System.out.println(mas[10]);
       }catch (ArrayIndexOutOfBoundsException ex){
           System.out.println("Вызван несуществующий элемент масива 'mas [10]' ");
       }
    }

}
