/**
 * 3.  Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого
 * массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */
package com.tms.array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        float[] array1 = createArray(5);
        float[] array2 = createArray(5);
        if (getAverage(array1) == getAverage(array2)) {
            System.out.println("The averages are equal");
        } else if (getAverage(array1) > getAverage(array2)) {
            System.out.println("The average of the first array is greater");
        } else {
            System.out.println("The average of the second array is greater");
        }
    }

    public static float[] createArray(int length) {
        float[] array = new float[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static float getAverage(float[] array) {
        float sum = 0;
        for (float a : array) {
            sum += a;
        }
        return sum / array.length;
    }
}
