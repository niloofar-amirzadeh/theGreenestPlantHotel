package TheGreenestPlantHotel;

public class CarnivorousPlant extends Plant {

    private static final double BASE_LITERS_PER_DAY = 0.1;
    private static final double LITERS_PER_METER = 0.2;

    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public double calculateLiquidAmount(){
        return BASE_LITERS_PER_DAY + (LITERS_PER_METER * getHeightInMeters());
    }
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
