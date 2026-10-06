package TheGreenestPlantHotel;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String IGGE_NAME = "igge";
    private static final String LAURA_NAME = "Laura";
    private static final String MEATLOAF_NAME = "Meatloaf";
    private static final String OLOF_NAME = "Olof";

    private static final double IGGE_HEIGHT_CM = 20;
    private static final double LAURA_HEIGHT_METERS = 5.0;
    private static final double MEATLOAF_HEIGHT_METERS = 0.7;
    private static final double OLOF_HEIGHT_METERS = 1.0;

    private static final String QUESTION = "Which plant should receive liquid?";
    private static final String TITLE = "Name of plant";
    private static final String EMPTY_NAME_MESSAGE = "Please enter a plant name. ";
    private static final String PLANT_NOT_FOUND_MESSAGE = "Plant not found. ";
    private static final String QUESTION2 = "Do you want information about another plant?";
    private static final String TITLE2 = "Continue?";


    public static void main(String[] args) {

        // Polymorphism: the Plant reference calls the overridden methods
        // of the actual object (Cactus, Palm or Carnivorous).
        Plant igge = new Cactus(IGGE_NAME, UnitConverter.centimetersToMeters(IGGE_HEIGHT_CM));
        Plant laura = new Palm(LAURA_NAME, LAURA_HEIGHT_METERS);
        Plant meatloaf = new CarnivorousPlant(MEATLOAF_NAME, MEATLOAF_HEIGHT_METERS);
        Plant olof = new Palm(OLOF_NAME, OLOF_HEIGHT_METERS);

        List<Plant> plants = new ArrayList<>();
        plants.add(igge);
        plants.add(laura);
        plants.add(meatloaf);
        plants.add(olof);


        while (true) {
            String plantName = JOptionPane.showInputDialog(
                    null, QUESTION, TITLE,
                    JOptionPane.QUESTION_MESSAGE);
            if (plantName == null) {
                return;
            }
            if (plantName.isBlank()) {
                JOptionPane.showMessageDialog(null, EMPTY_NAME_MESSAGE);
                continue;
            }
            boolean plantFound = false;

            for (Plant plant : plants) {
                if (plant.getName().equalsIgnoreCase(plantName)) {
                    String name =
                            plant.getName().substring(0, 1).toUpperCase()
                                    + plant.getName().substring(1).toLowerCase();
                    String result = name + " needs "
                            + plant.calculateLiquidAmount()
                            + " liters of "
                            + plant.getLiquidType().getDisplayName()
                            + " per day";
                    //polymorfism : plant.calculateLiquidAmount(), plant.getLiquidType()
                    JOptionPane.showMessageDialog(null, result);
                    plantFound = true;
                    int answer = JOptionPane.showConfirmDialog(
                            null, QUESTION2, TITLE2,
                            JOptionPane.YES_NO_OPTION);
                    if (answer == JOptionPane.NO_OPTION) {
                        return;
                    }

                    break;
                }
            }
            if (!plantFound) {
                JOptionPane.showMessageDialog(null, PLANT_NOT_FOUND_MESSAGE);
            }
        }
    }
}


