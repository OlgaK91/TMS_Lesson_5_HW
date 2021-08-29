/**
 * 2. Напишите программу которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
 * 	Для определения четности числа используйет операцию получения остатка от деления - операция выглядит так: '% 2').
 */
package com.tms.decisionMaking;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.close();
        if (givenNumber%2 == 0 )
            System.out.println("Given number is even number");
        else
            System.out.println("Given number is odd number");
    }
}


