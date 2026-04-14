package uc15;

public class GoodsBogie {

    private BogieShape shape;
    private CargoType cargo;

    public GoodsBogie(BogieShape shape) {
        this.shape = shape;
    }

    public void assignCargo(CargoType cargo) {
        try {
            // ❌ Unsafe condition
            if (shape == BogieShape.RECTANGULAR && cargo == CargoType.PETROLEUM) {
                throw new CargoSafetyException("Petroleum cannot be assigned to Rectangular Bogie");
            }

            // ✅ Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.");
        }
    }

    public CargoType getCargo() {
        return cargo;
    }
}