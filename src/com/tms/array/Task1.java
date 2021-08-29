/**
 * 1. Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */
package com.tms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.close();
        Arrays.sort(array);
        int numberPosition = Arrays.binarySearch(array, givenNumber);
        if (numberPosition < 0) {
            System.out.println("Array doesn't contain given number");
        } else {
            System.out.println("Array contains given number");
            int[] newArray = Arrays.stream(array).filter(a -> a != givenNumber).toArray();
            System.out.println(Arrays.toString(newArray));
        }
    }
}

