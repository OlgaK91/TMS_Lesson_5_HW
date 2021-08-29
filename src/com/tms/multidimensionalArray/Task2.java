/**
 * 2. Умножение двух матриц  Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.  первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * втрой массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}  Ожидаемый результат:  1  2  3   1  1  1   0  0  0
 Определение. Результатом умножения матриц Am×n и Bn×k будет матрица Cm×k такая, что элемент матрицы C,
 стоящий в i-той строке и j-том столбце (cij), равен сумме произведений элементов i-той строки матрицы A
 на соответствующие элементы j-того столбца матрицы B:
 cij = ai1 · b1j + ai2 · b2j + ... + ain · bnj
 */
package com.tms.multidimensionalArray;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int m = 0;
        for (int a[] : array1
        ) {
            m = m + 1;
        }
        int n = array1[0].length;
        int n1 = 0;
        for (int a[] : array2) {
            n1 = n1 + 1;
        }
        if (n == n1) {
            int k = array2[0].length;
            int[][] multiplyMatrixResult = new int[m][k];
            for (int[] a : multiplyMatrixResult) {
                Arrays.fill(a, 0);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    for (int ind = 0; ind < n; ind++) {
                        multiplyMatrixResult[i][j] = multiplyMatrixResult[i][j] + array1[i][ind] * array2[ind][j];
                    }
                }
            }
            for (int[] a : multiplyMatrixResult) {
                System.out.println(Arrays.toString(a));
            }
        } else {
            System.out.println("Matrix multiplying is impossible because of incorrect matrix dimensions");
        }
    }
}