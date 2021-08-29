/**
 * 5. Создайте двумерный массив целых чисел.  Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
package com.tms.multidimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[][] array2dim = new int[3][5];
        int n = 0;
        for (int[] a : array2dim){
            n ++;
        }
        for (int i = 0; i<n;i++) {
            array2dim[i] = createArray(5);
        }
        System.out.println(Arrays.deepToString(array2dim));
        for (int[] a : array2dim) {
            Arrays.sort(a);
        }
        System.out.println(Arrays.deepToString(array2dim));

    }

    public static int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
