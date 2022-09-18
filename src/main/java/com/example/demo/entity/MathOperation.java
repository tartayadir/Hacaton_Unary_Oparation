package com.example.demo.entity;

public enum MathOperation {

    ABS, SQRT, FACTORIAL, X_DIVIDE_ONE, POW;

    public static MathOperation getOperation(String operation) {

        return switch(operation) {

            case "sqrt" -> SQRT;
            case "abs" -> ABS;
            case "!" -> FACTORIAL;
            case "pow" -> POW;
            default -> X_DIVIDE_ONE;
        };
    }

}
