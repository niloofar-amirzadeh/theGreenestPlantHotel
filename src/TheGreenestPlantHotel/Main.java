package TheGreenestPlantHotel;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.Locale;
import static TheGreenestPlantHotel.AppConstants.*;

public class Main {

    public static void main(String[] args) {
        runProgram();
    }
        static void runProgram(){
        // Polymorphism: Plant references can hold objects of different subclasses.
        Plant igge = new Cactus(IGGE_NAME, UnitConverter.centimetersToMeters(IGGE_HEIGHT_CM));
        Plant laura = new Palm(LAURA_NAME, LAURA_HEIGHT_METERS);
        Plant meatloaf = new CarnivorousPlant(MEATLOAF_NAME, MEATLOAF_HEIGHT_METERS);
        Plant olof = new Palm(OLOF_NAME, OLOF_HEIGHT_METERS);

        List<Plant> plants = List.of(igge,laura,meatloaf,olof);

        while (true) {
            String plantName = JOptionPane.showInputDialog(null, QUESTION, TITLE,
                    JOptionPane.QUESTION_MESSAGE);
            if (plantName == null) {
                return;
            }
            plantName = plantName.trim();
            if (plantName.isBlank()) {
                JOptionPane.showMessageDialog(null, EMPTY_NAME_MESSAGE);
                continue;
            }
            boolean plantFound = false;

            for (Plant plant : plants) {
                if (plant.getName().equalsIgnoreCase(plantName)) {

                    /* Polymorphism allows the same method call to produce different results
                       depending on the actual plant type.*/
                    // Runtime polymorphism: Java calls the overridden method based on the object's actual type.
                    String result = String.format(Locale.US, RESULT_FORMAT, plant.getName(),
                            plant.calculateLiquidAmount(), plant.getLiquidType().getDisplayName());

                    JOptionPane.showMessageDialog(null, result);
                    plantFound = true;
                    int answer = JOptionPane.showConfirmDialog(null, CONTINUE_QUESTION, CONTINUE_TITLE,
                            JOptionPane.YES_NO_OPTION);
                    if (answer != JOptionPane.YES_OPTION) {
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