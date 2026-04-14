package uc16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerBogieSorterTest {

    @Test
    public void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};

        PassengerBogieSorter sorter = new PassengerBogieSorter();
        sorter.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    public void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};

        PassengerBogieSorter sorter = new PassengerBogieSorter();
        sorter.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    public void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};

        PassengerBogieSorter sorter = new PassengerBogieSorter();
        sorter.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 56, 72}, arr);
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] arr = {50};

        PassengerBogieSorter sorter = new PassengerBogieSorter();
        sorter.bubbleSort(arr);

        assertArrayEquals(new int[]{50}, arr);
    }

    @Test
    public void testSort_AllEqualValues() {
        int[] arr = {40, 40, 40};

        PassengerBogieSorter sorter = new PassengerBogieSorter();
        sorter.bubbleSort(arr);

        assertArrayEquals(new int[]{40, 40, 40}, arr);
    }
}