package uc17;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BogieNameSorterTest {

    @Test
    public void testSort_BasicAlphabeticalSorting() {
        String[] arr = {"Sleeper","AC Chair","First Class","General","Luxury"};

        BogieNameSorter sorter = new BogieNameSorter();
        sorter.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    public void testSort_UnsortedInput() {
        String[] arr = {"Luxury","General","Sleeper","AC Chair"};

        BogieNameSorter sorter = new BogieNameSorter();
        sorter.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Luxury","Sleeper"},
                arr
        );
    }

    @Test
    public void testSort_AlreadySortedArray() {
        String[] arr = {"AC Chair","First Class","General"};

        BogieNameSorter sorter = new BogieNameSorter();
        sorter.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","First Class","General"},
                arr
        );
    }

    @Test
    public void testSort_DuplicateBogieNames() {
        String[] arr = {"Sleeper","AC Chair","Sleeper","General"};

        BogieNameSorter sorter = new BogieNameSorter();
        sorter.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"AC Chair","General","Sleeper","Sleeper"},
                arr
        );
    }

    @Test
    public void testSort_SingleElementArray() {
        String[] arr = {"Sleeper"};

        BogieNameSorter sorter = new BogieNameSorter();
        sorter.sortBogieNames(arr);

        assertArrayEquals(
                new String[]{"Sleeper"},
                arr
        );
    }
}