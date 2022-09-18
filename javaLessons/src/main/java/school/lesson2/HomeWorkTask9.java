package school.lesson2;

/* Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
типа int длиной len, каждая ячейка которого равна initialValue; */

import java.util.Arrays;

public class HomeWorkTask9 {
    public static void main(String[] args) {
        int[] myA = createArray(3, 5);
        System.out.print(Arrays.toString(myA));

    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
