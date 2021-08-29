/**
 * 7.Реализуйте алгоритм сортировки пузырьком.
 */
package com.tms.array;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] array = createArray(10);
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int a = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] createArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
