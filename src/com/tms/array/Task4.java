/**
 * 4. Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 * Создайте массив из n случайных целых чисел и выведите его на экран.
 * Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * Если n не удовлетворяет условию - выведите сообщение об этом.
 * Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
package com.tms.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array length between 5 and 10(including 10)");
        int arrayLength;
        do {
            arrayLength = scanner.nextInt();
            if (arrayLength <= 5 || arrayLength > 10) {
                System.out.println("Entered invalid value of array length. Try again.");
            }
        }
        while (arrayLength <= 5 || arrayLength > 10);
        scanner.close();
        int[] array1 = createArray(5);
        int[] array2 = Arrays.stream(array1).filter(a -> a % 2 == 0).toArray();
        System.out.println(Arrays.toString(array2));
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
