/**
 * 0. Создать трехмерный массив из целых чисел  С помощью циклов "пройти" по всему массиву
 * и увеличить каждый элемент на заданное число.  Пусть число, на которое будет увеличиваться
 * каждый элемент, задается из консоли.
 */
package com.tms.multidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[][][] array3dim = {{{2, 3, 4}, {5, 6, 7}}, {{7, 8, 9}}};
        System.out.println(Arrays.deepToString(array3dim));
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        for (int[][] array2dim : array3dim) {
            for (int[] array1dim : array2dim) {
                for (int i = 0; i < array1dim.length; i++) {
                    array1dim[i] = array1dim[i] + num;
                }
                // пробовала так, но ничего не изменяется, почему не поняла
                //for (int a : array1dim) {
                //    a = a + num;
                //}
            }
        }
        System.out.println(Arrays.deepToString(array3dim));
    }
}
