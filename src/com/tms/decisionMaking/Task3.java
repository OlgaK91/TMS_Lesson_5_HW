/**
 * 3. Для введенного числа t (температура на улице) вывести
 * Если t>–5, то вывести «Тепло».
 * Если –5>= t > –20, то вывести «Нормально».
 * Если –20>= t, то вывести «Холодно».
 */
package com.tms.decisionMaking;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the temperature:");
        Scanner scanner = new Scanner(System.in);
        String givenNumberString = scanner.next();
        scanner.close();
        double givenNumber = Double.parseDouble(givenNumberString);
        if (givenNumber <= -20.0)
            System.out.println("Icily");
        else if (givenNumber > -5.0)
            System.out.println("Warmly");
        else System.out.println("Normally");
    }
}
