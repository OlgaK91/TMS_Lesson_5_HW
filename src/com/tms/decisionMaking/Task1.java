/**
 * 1. Написать программу для вывода названия поры года по номеру месяца.
 * 	При решении используйте оператор if-else-if.
 */
package com.tms.decisionMaking;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the month number:");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        scanner.close();
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12 )
            System.out.println("Winter");
        else if (monthNumber >=3 && monthNumber <=5)
            System.out.println("Spring");
        else if (monthNumber >=6 && monthNumber <=8)
            System.out.println("Summer");
        else if (monthNumber >=9 && monthNumber <=11)
            System.out.println("Autumn");
        else
            System.out.println("Invalid month number");
    }
}


