/**
 * 1. Шахматная доска  Создать программу для расскаски шахматной доски с помощю цикла.
 * Создать двумерный массив String'ов 8х8.   С помощью циклов задать элементам циклам значения B(Black) или W(White).
 * Результат работы программы:
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 * W  B  W  B  W  B  W  B
 * B  W  B  W  B  W  B  W
 */
package com.tms.multidimensionalArray;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = "W";
                } else {
                    chess[i][j] = "B";
                }
            }
        }
        for (String[] a : chess) {
            System.out.println(Arrays.toString(a));
        }
    }
}
