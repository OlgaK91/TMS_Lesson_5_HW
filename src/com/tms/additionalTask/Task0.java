/**
 * 0. Выведите на экран первые 11 членов последовательности Фибоначчи
 */
package com.tms.additionalTask;

public class Task0 {
    public static void main(String[] args) {
        int[] fibonacciSequence = new int[11];
        fibonacciSequence[0] = 1;
        fibonacciSequence[1] = 1;
        System.out.print(1 + " " + 1 + " ");
        for (int i = 2; i < fibonacciSequence.length; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}
