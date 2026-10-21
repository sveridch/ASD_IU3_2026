package ru.bmstu.lab01.task_1;

import java.util.Scanner;

/**
 * Задача 1. Максимум и минимум.
 * Вход: массив из n целых чисел.
 * Выход: минимальный и максимальный элементы массива.
 */
public class MinMax {

    //метод для тестов
    public static int[] findMinMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("массив не может быть пустым");
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        return new int[]{min, max};
    }

    //ввод-вывод через стандартные потоки
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = findMinMax(array);
        System.out.println(result[0] + " " + result[1]);

        scanner.close();
    }
}