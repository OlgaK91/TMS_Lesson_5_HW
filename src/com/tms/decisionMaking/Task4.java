/**
 * 4. По введенному номеру определить цвет радуги (1 –
 * красный, 4 – зеленый и т. д.)
 */

package com.tms.decisionMaking;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.close();
        switch (givenNumber) {
            case (1):
                System.out.println("red");
                break;
            case (2):
                System.out.println("orange");
                break;
            case (3):
                System.out.println("yellow");
                break;
            case (4):
                System.out.println("green");
                break;
            case (5):
                System.out.println("blue");
                break;
            case (6):
                System.out.println("indigo");
                break;
            case (7):
                System.out.println("purple");
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}