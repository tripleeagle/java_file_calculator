package eu.cz.lyalival;

import eu.cz.lyalival.controller.MainController;
import org.junit.Test;


/**
 * @author lyalival
 */
public class MainTest {
    private static String projectsFolder = System.getProperty("user.home") + "/Projects/";
    private static String resourcesFolder = "Calculator/src/test/resources/inputs/";

    @Test
    public void testInput1 () {
        Double result = MainController.calculateFromFile(projectsFolder + resourcesFolder + "input1.txt");
        assert ( result == 18 );
    }

    @Test
    public void testInput2 () {
        Double result = MainController.calculateFromFile(projectsFolder + resourcesFolder + "input2.txt");
        assert ( result == 45 );
    }

    @Test
    public void testInput3 () {
        Double result = MainController.calculateFromFile(projectsFolder + resourcesFolder + "input3.txt");
        assert ( result == 1 );
    }

    @Test
    public void testInput4 () {
        Double result = MainController.calculateFromFile(projectsFolder + resourcesFolder + "input4.txt");
        assert ( result == -42 );
    }
}
