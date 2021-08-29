/**
 * 4. Создайте двумерный массив.  Выведите на консоль диагонали массива.
 */
package com.tms.multidimensionalArray;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i<array[0].length;i++){
            for (int j = 0; j<array[0].length;j++){
                if (i==j){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println(" ");
        for (int i = 0; i<array[0].length;i++){
            for (int j = array[0].length - 1; j>=0;j--){
                if (i==array[0].length -1 - j){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
