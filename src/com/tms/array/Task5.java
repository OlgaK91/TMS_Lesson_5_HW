/**
 * 5. Создайте массив и заполниет массив.
 * Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль.
 * Снова выведете массив на экран на отдельной строке.
 */
package com.tms.array;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] array = createArray(10);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0)
            {array[i] = 0;}

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
