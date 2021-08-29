/**
 * 3. Создайте двумерный массив целых чисел.  Выведите на консоль сумму всех элементов массива.
 */
package com.tms.multidimensionalArray;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{1, 1}, {1, 2}, {1, 3}};
        int sum = 0;
        for (int[] a : array) {
            for (int i : a) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
