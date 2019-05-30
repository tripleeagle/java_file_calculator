package eu.cz.lyalival.model;

import eu.cz.lyalival.model.Operations.Operation;

/**
 * @author lyalival
 */
public class CalcStep {
    private final Operation operation;
    private final Double num;

    public CalcStep(Operation operation, Double num) {
        this.operation = operation;
        this.num = num;
    }

    public Operation getOperation() {
        return operation;
    }

    public Double getNum() {
        return num;
    }
}

