/**
 * 3. Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 * В решении используйте цикл while.
 */
package com.tms.cycle;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
    }
}
