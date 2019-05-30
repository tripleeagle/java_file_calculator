package eu.cz.lyalival.controller;

import eu.cz.lyalival.model.CalcStep;
import eu.cz.lyalival.model.Operations.Operation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lyalival
 */
public class MainController {
    private static String APPLY = "apply";
    /**
    @note Each operation in the filePath must be separated by \n.
    The file could contain only one block of operations. (in other words only one "apply")
     */
    public static Double calculateFromFile ( String filePath ){
        Double result = 0.0;
        Double firstNum = 0.0;
        List calcSteps = new ArrayList();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String currentLine;

            while ((currentLine = reader.readLine()) != null)  {
                String[] splitted = currentLine.split(" ");
                if ( splitted[0].equals(APPLY) ){
                    firstNum = Double.parseDouble(splitted[1]);
                    break;
                }
                calcSteps.add(new CalcStep(OperationFactory.getOperation(splitted[0]),Double.parseDouble(splitted[1])));
            }
            result = calculateFromCalcStepList(firstNum,calcSteps);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } finally {
            if ( reader != null ){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    private static Double calculateFromCalcStepList ( Double firstNum, List<CalcStep> calcStepList ){
        Double result = firstNum;
        for ( CalcStep calcStep : calcStepList ){
            result = calcStep.getOperation().calculate(result,calcStep.getNum());
        }
        return result;
    }
}
