package TheGreenestPlantHotel;
/* Inheritance allows this plant type to reuse common properties
    from Plant while providing its own liquid calculation.*/
public class Palm extends Plant {

    private static final double LITERS_PER_METER = 0.5;

    public Palm(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public double calculateLiquidAmount(){
        return LITERS_PER_METER * getHeightInMeters();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}
