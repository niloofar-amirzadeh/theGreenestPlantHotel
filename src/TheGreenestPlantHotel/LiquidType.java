package TheGreenestPlantHotel;
/*An enum ensures that only predefined liquid types can be used,
  preventing invalid values and improving type safety.*/
public enum LiquidType {

    TAP_WATER("tap water"),
    MINERAL_WATER("mineral water"),
    PROTEIN_DRINK("protein drink");

    private final String displayName;

    LiquidType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}


