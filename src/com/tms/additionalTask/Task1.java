/**
 * 1. За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которую пользователь
 * вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
 * 	Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
 */

package com.tms.additionalTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter deposit amount and number of months ");
        Scanner scanner = new Scanner(System.in);
        String givenValuesString = scanner.next();
        float depositAmount = Float.parseFloat(givenValuesString);
        int monthNumber = scanner.nextInt();
        scanner.close();
        for (int i = 1;i<=monthNumber; i++){
            depositAmount = getMonthAmount(depositAmount);
        }
        System.out.println(depositAmount);
    }

    public static float getMonthAmount(float sum){
        return sum +=sum * 7/100;
    }
}
