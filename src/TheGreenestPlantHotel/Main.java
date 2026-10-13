package TheGreenestPlantHotel;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import static TheGreenestPlantHotel.AppConstans.*;

public class Main {

    public static void main(String[] args) {
        runProgram();
    }
        static void runProgram(){
        // Polymorphism: the Plant reference calls the overridden methods
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
            plantName = plantName.trim();
            if (plantName.isBlank()) {
                JOptionPane.showMessageDialog(null, EMPTY_NAME_MESSAGE);
                continue;
            }
            boolean plantFound = false;

            for (Plant plant : plants) {
                if (plant.getName().equalsIgnoreCase(plantName)) {
                    String name = plant.getName().substring(0, 1).toUpperCase()
                                    + plant.getName().substring(1).toLowerCase();

                    /* Polymorphism allows the same method call to produce different results
                       depending on the actual plant type.*/
                    String result = String.format(Locale.US, RESULT_FORMAT, name,
                            plant.calculateLiquidAmount(), plant.getLiquidType().getDisplayName());

                    JOptionPane.showMessageDialog(null, result);
                    plantFound = true;
                    int answer = JOptionPane.showConfirmDialog(
                            null, QUESTION2, TITLE2,
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