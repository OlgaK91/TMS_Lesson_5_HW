/**
 * 5. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
 */
package com.tms.cycle;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            System.out.print((int) Math.pow(i,2) + " ");
        }
    }
}
