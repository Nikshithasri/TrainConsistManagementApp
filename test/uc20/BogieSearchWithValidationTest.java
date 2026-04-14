package uc20;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BogieSearchWithValidationTest {

    @Test
    public void testSearch_ThrowsExceptionWhenEmpty() {
        String[] arr = {};
        BogieSearchWithValidation search = new BogieSearchWithValidation();

        assertThrows(IllegalStateException.class, () -> {
            search.search(arr, "BG101");
        });
    }

    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        String[] arr = {"BG101","BG205"};
        BogieSearchWithValidation search = new BogieSearchWithValidation();

        assertDoesNotThrow(() -> {
            search.search(arr, "BG101");
        });
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};
        BogieSearchWithValidation search = new BogieSearchWithValidation();

        assertTrue(search.search(arr, "BG205"));
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        String[] arr = {"BG101","BG205","BG309"};
        BogieSearchWithValidation search = new BogieSearchWithValidation();

        assertFalse(search.search(arr, "BG999"));
    }

    @Test
    public void testSearch_SingleElementValidCase() {
        String[] arr = {"BG101"};
        BogieSearchWithValidation search = new BogieSearchWithValidation();

        assertTrue(search.search(arr, "BG101"));
    }
}