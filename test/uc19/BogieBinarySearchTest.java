package uc19;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BogieBinarySearchTest {

    @Test
    public void testBinarySearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        BogieBinarySearch search = new BogieBinarySearch();

        assertTrue(search.binarySearch(arr, "BG309"));
    }

    @Test
    public void testBinarySearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309"};
        BogieBinarySearch search = new BogieBinarySearch();

        assertFalse(search.binarySearch(arr, "BG999"));
    }

    @Test
    public void testBinarySearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        BogieBinarySearch search = new BogieBinarySearch();

        assertTrue(search.binarySearch(arr, "BG101"));
    }

    @Test
    public void testBinarySearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        BogieBinarySearch search = new BogieBinarySearch();

        assertTrue(search.binarySearch(arr, "BG309"));
    }

    @Test
    public void testBinarySearch_SingleElementArray() {
        String[] arr = {"BG101"};
        BogieBinarySearch search = new BogieBinarySearch();

        assertTrue(search.binarySearch(arr, "BG101"));
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        String[] arr = {};
        BogieBinarySearch search = new BogieBinarySearch();

        assertFalse(search.binarySearch(arr, "BG101"));
    }

    @Test
    public void testBinarySearch_UnsortedInputHandled() {
        String[] arr = {"BG309","BG101","BG550","BG205","BG412"};
        BogieBinarySearch search = new BogieBinarySearch();

        assertTrue(search.binarySearch(arr, "BG205"));
    }
}
