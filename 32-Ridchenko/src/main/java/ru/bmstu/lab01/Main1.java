package ru.bmstu.lab01;

public class Main1 {
    
    //метод принимает массив и возвращает массив из двух чисел(мин/макс)
    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }

        int min = array[0];
        int max = array[0];

        //проходим по массиву 1 раз (O(n))
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return new int[]{min, max};
    }
}
