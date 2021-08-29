/**
 * 6. Создайте массив строк. Заполните его произвольными именами людей.
 * Отсортируйте массив.
 * Результат выведите на консоль.
 */
package com.tms.array;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] nameArray = new String[]{"Den","Alex","Shakira,Shakira"};
        Arrays.sort(nameArray);
        System.out.println(Arrays.toString(nameArray));
    }
}
