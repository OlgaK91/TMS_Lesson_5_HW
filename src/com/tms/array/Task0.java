/**
 * 0. Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 */
package com.tms.array;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int a:array){
//            a = (int) Math.random();
//        }
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
        }


    }
}
