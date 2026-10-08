package TheGreenestPlantHotel;

public abstract class Plant implements Waterable {
//TheGreenestPlantHotel.Plant is a base class and accepts the TheGreenestPlantHotel.Waterable contract.
//I don't want a generic TheGreenestPlantHotel.Plant to be created, only specific types of Plants should be created.

    //Encapsulation: fields are private and accessed through public methods.
    // through read-only getters.
    private final String name;
    private final double heightInMeters;


    public Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

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
