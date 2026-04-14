package uc18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BogieSearchTest {

    @Test
    public void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        BogieSearch search = new BogieSearch();

        assertTrue(search.searchBogie(arr, "BG309"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        BogieSearch search = new BogieSearch();

        assertFalse(search.searchBogie(arr, "BG999"));
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        BogieSearch search = new BogieSearch();

        assertTrue(search.searchBogie(arr, "BG101"));
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        BogieSearch search = new BogieSearch();

        assertTrue(search.searchBogie(arr, "BG309"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};
        BogieSearch search = new BogieSearch();

        assertTrue(search.searchBogie(arr, "BG101"));
    }
}