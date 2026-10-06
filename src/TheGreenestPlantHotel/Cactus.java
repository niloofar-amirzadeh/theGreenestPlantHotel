package TheGreenestPlantHotel;

public class Cactus extends Plant {

    private static final double CENTILITER_PER_DAY = 2.0;

    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public double calculateLiquidAmount(){
       return UnitConverter.centiliterToLiter(CENTILITER_PER_DAY);
    }
    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
