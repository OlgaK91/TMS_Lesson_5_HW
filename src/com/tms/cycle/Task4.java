/**
 * 4. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */
package com.tms.cycle;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(-5 * (i - 1) + " ");
        }
    }
}
