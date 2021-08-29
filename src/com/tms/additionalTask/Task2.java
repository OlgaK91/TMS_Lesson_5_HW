/**
 * 2. Напишите программу, которая выводит на консоль таблицу умножения
 */
package com.tms.additionalTask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(givenNumber + " * " + i + " = " + givenNumber * i);
        }

    }
}
