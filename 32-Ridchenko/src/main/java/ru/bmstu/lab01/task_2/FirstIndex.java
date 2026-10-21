package ru.bmstu.lab01.task_2;

import java.util.Scanner;

/**
 * Задача 2. Индекс первого вхождения.
 * Вход: массив из n целых чисел и число x.
 * Выход: индекс первого элемента, равного x. Если такого нет - вывести -1.
 */
public class FirstIndex {

    //метод для тестов
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

    //ввод-вывод через стандартные потоки
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        System.out.println(findFirstIndex(array, x));

        scanner.close();
    }
}