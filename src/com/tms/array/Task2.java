/**
 * 2. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * Пусть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */
package com.tms.array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the array length");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        scanner.close();
        float[] array = new float[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (float) Math.random();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("\nMin element = " + getMin(array));
        System.out.println("Max element = " + getMax(array));
        System.out.println("Average = " + getAverage(array));
    }

    public static float getMin(float[] array) {
        float min = array[0];
        for (float a : array) {
            if (a < min)
                min = a;
        }
        return min;
    }

    public static float getMax(float[] array) {
        float max = array[0];
        for (float a : array) {
            if (a > max)
                max = a;
        }
        return max;
    }

    public static float getAverage(float[] array) {
        float sum = 0;
        for (float a : array) {
            sum += a;
        }
        return sum / array.length;
    }
}
