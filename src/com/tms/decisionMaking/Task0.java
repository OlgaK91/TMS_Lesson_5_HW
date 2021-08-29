/**
 * 0. Написать программу для вывода названия поры года по номеру месяца.
 * 	При решении используйте оператор switch-case.
 */
package com.tms.decisionMaking;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        System.out.println("Enter the month number:");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        scanner.close();
        switch (monthNumber) {
            case (1):
                System.out.println("Winter");
                break;
            case (2):
                System.out.println("Winter");
                break;
            case (3):
                System.out.println("Spring");
                break;
            case (4):
                System.out.println("Spring");
                break;
            case (5):
                System.out.println("Spring");
                break;
            case (6):
                System.out.println("Summer");
                break;
            case (7):
                System.out.println("Summer");
                break;
            case (8):
                System.out.println("Summer");
                break;
            case (9):
                System.out.println("Autumn");
                break;
            case (10):
                System.out.println("Autumn");
                break;
            case (11):
                System.out.println("Autumn");
                break;
            case (12):
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
