package ru.bmstu.lab01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main2Test {

    @Test
    public void testElementExists() {
        int[] array = {5, 2, 9, 1, 7};
        assertEquals(2, Main2.findFirstIndex(array, 9));
    }

    @Test
    public void testFirstOfDuplicates() {
        int[] array = {5, 2, 9, 5, 7};
        assertEquals(0, Main2.findFirstIndex(array, 5));
    }

    @Test
    public void testElementNotFound() {
        int[] array = {5, 2, 9, 1, 7};
        assertEquals(-1, Main2.findFirstIndex(array, 10));
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(-1, Main2.findFirstIndex(array, 5));
    }
}