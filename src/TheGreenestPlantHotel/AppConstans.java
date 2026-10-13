package TheGreenestPlantHotel;

/*Constants keep fixed values in one place, making the code
easier to maintain and avoiding hardcoded values throughout the program.*/
public final class AppConstans {

    public static final String IGGE_NAME = "igge";
    public static final String LAURA_NAME = "Laura";
    public static final String MEATLOAF_NAME = "Meatloaf";
    public static final String OLOF_NAME = "Olof";

    public static final double IGGE_HEIGHT_CM = 20;
    public static final double LAURA_HEIGHT_METERS = 5.0;
    public static final double MEATLOAF_HEIGHT_METERS = 0.7;
    public static final double OLOF_HEIGHT_METERS = 1.0;

    public static final String QUESTION = "Which plant should receive liquid?";
    public static final String TITLE = "Name of plant";
    public static final String EMPTY_NAME_MESSAGE = "Please enter a plant name. ";
    public static final String RESULT_FORMAT = "%s needs %.2f liters of %s per day.";
    public static final String QUESTION2 = "Do you want information about another plant?";
    public static final String TITLE2 = "Continue?";
    public static final String PLANT_NOT_FOUND_MESSAGE = "Plant not found. ";

    // Prevents creating unnecessary instances of this constants class.
    private AppConstans(){}
}