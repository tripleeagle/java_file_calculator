package eu.cz.lyalival.controller;

import eu.cz.lyalival.model.Operations.*;

/**
 * @author lyalival
 */
public class OperationFactory {
    private static String ADD = "add";
    private static String SUBTRACT = "subtract";
    private static String MULTIPLY = "multiply";
    private static String DIVIDE = "divide";

    public static Operation getOperation( String operation ){
        if (operation.equals(ADD))
            return new Addition();
        if (operation.equals(SUBTRACT))
            return new Subtraction();
        if (operation.equals(MULTIPLY))
            return new Multiplication();
        if (operation.equals(DIVIDE))
            return new Division();
        return null;
    }
}
