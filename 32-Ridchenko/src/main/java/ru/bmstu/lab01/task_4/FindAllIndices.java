package ru.bmstu.lab01.task_4;

import java.util.ArrayList;
import java.util.List;

public class FindAllIndices {
    public static List<Integer> findAllIndices(int[] array, int x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                //запоминаем индекс подходящего элемента
                indices.add(i);
            }
        }
        return indices;
    }
}