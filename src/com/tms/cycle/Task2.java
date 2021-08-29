/**
 * 2. Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * Для ввода числа воспользуйтесь классом Scanner.
 */
package com.tms.cycle;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter positive integer:");
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for (int i = 1; i <= givenNumber; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
