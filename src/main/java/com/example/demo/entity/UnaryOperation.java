package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UnaryOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstNumber;

    private String result;

    private MathOperation mathOperation;

    public UnaryOperation() {
    }

    public UnaryOperation(String firstNumber, MathOperation mathOperation) {
        this.firstNumber = firstNumber;
        this.mathOperation = mathOperation;
    }
}
