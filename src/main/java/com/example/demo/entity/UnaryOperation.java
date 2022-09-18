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
    private String number;

    private String result;

    @Enumerated(EnumType.STRING)
    private MathOperation mathOperation;

    public UnaryOperation() {
    }

    public UnaryOperation(String number, MathOperation mathOperation) {
        this.number = number;
        this.mathOperation = mathOperation;
    }
}
