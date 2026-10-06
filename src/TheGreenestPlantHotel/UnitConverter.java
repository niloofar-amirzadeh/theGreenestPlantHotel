package TheGreenestPlantHotel;

public class UnitConverter {

    private static final int CENTIMETERS_PER_METER = 100;
    private static final int CENTILITER_PER_LITER = 100;

    public static double centimetersToMeters(double centimeters){
    return centimeters/CENTIMETERS_PER_METER;
    }

    public static double centiliterToLiter(double centiliters){
        return centiliters/CENTILITER_PER_LITER;
    }
}
