package TheGreenestPlantHotel;
/* Separating unit conversions keeps calculations reusable
 and avoids repeating conversion logic in different classes.*/
public class UnitConverter {

    private static final int CENTIMETERS_PER_METER = 100;
    private static final int CENTILITERS_PER_LITER = 100;

    public static double centimetersToMeters(double centimeters){
    return centimeters / CENTIMETERS_PER_METER;
    }

    public static double centilitersToLiter(double centiliters){
        return centiliters / CENTILITERS_PER_LITER;
    }
}
