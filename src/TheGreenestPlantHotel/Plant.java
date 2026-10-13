package TheGreenestPlantHotel;
/*An abstract class allows all plant types to share common properties
 while leaving plant-specific behavior to the subclasses.*/
public abstract class Plant implements Waterable {
/*Plant is a base class and accepts the Waterable contract.
 I don't want a generic Plant to be created, only specific types of Plants should be created.*/

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

    //Since different plant types have different responses, an abstract method is suitable in Plant:
    //abstract methods cannot have body
    public abstract LiquidType getLiquidType();
}
