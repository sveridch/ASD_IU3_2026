package ru.bmstu.lab01.task_3;

public class CountOccurrences {
    public static int count(int[] array, int x) {
        int count = 0;
        for (int num : array) {
            if (num == x) {
                count++;
            }
        }
        return count;
    }
}