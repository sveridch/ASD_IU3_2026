package ru.bmstu.lab01;

public class Main2 {

    //возвращает индекс первого вхождения числа x или -1, если элемента нет
    public static int findFirstIndex(int[] array, int x) {
        if (array == null) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }

        return -1;
    }
}