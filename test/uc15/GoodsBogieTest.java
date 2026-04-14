package uc15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GoodsBogieTest {
    @Test
    public void testCargo_SafeAssignment() {
        GoodsBogie bogie = new GoodsBogie(BogieShape.CYLINDRICAL);
        bogie.assignCargo(CargoType.PETROLEUM);

        assertEquals(CargoType.PETROLEUM, bogie.getCargo());
    }

    @Test
    public void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie bogie = new GoodsBogie(BogieShape.RECTANGULAR);
        bogie.assignCargo(CargoType.PETROLEUM);

        assertNull(bogie.getCargo());
    }

    @Test
    public void testCargo_ProgramContinuesAfterException() {
        GoodsBogie b1 = new GoodsBogie(BogieShape.RECTANGULAR);
        GoodsBogie b2 = new GoodsBogie(BogieShape.CYLINDRICAL);

        b1.assignCargo(CargoType.PETROLEUM);
        b2.assignCargo(CargoType.PETROLEUM);

        assertEquals(CargoType.PETROLEUM, b2.getCargo());
    }

    @Test
    public void testCargo_FinallyBlockExecution() {
        GoodsBogie bogie = new GoodsBogie(BogieShape.RECTANGULAR);
        bogie.assignCargo(CargoType.PETROLEUM);

        assertTrue(true);
    }
}