package ru.bmstu.lab01.task_3;

import java.util.Scanner;

/**
 * Задача 3. Подсчёт вхождений.
 * Вход: массив из n целых чисел и число x.
 * Выход: количество элементов, равных x.
 */
public class CountOccurrences {

    //метод для тестов
    public static int count(int[] array, int x) {
        int count = 0;
        for (int num : array) {
            if (num == x) count++;
        }
        return count;
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
        System.out.println(count(array, x));
        
        scanner.close(); //закрываем сканер, чтобы не было утечки ресурсов
    }
}