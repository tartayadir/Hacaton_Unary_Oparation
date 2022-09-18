package com.example.demo.service;

import com.example.demo.entity.UnaryOperation;

import java.math.BigDecimal;

public interface UnaryOperationService {

    void saveEntity(UnaryOperation unaryOperation);

    String calculateResult(UnaryOperation operation);

    BigDecimal sqrt(BigDecimal number);

    BigDecimal factorial(BigDecimal number);

    BigDecimal abs(BigDecimal number);

    BigDecimal numberDividedByOne(BigDecimal number);

    BigDecimal pow(BigDecimal number);
}
