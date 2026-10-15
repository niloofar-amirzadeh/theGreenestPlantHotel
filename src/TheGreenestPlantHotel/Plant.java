package TheGreenestPlantHotel;
/*An abstract class allows all plant types to share common properties
 while leaving plant-specific behavior to the subclasses.
 Plant implements the Waterable interface, ensuring that all concrete plant types provide a liquid calculation.
 Plant is abstract because only specific plant types should be instantiated.*/

public abstract class Plant implements Waterable {

    // Encapsulation protects the plant's data from direct access.
    private final String name;
    private final double heightInMeters;

    public Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }
    // Getters provide controlled access to the values.
    public String getName() {
        return name;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public abstract LiquidType getLiquidType();
}
