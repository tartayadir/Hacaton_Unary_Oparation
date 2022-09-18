package com.example.demo.entity;

public enum MathOperation {

    POW, ABS, SQRT, FACTORIAL, X_DIVIDE_ONE;

    public static MathOperation getOperation(String operation) {

        return switch(operation) {

            case "sqrt" -> SQRT;
            case "pow" -> POW;
            case "abs" -> ABS;
            default -> X_DIVIDE_ONE;
        };
    }

}
