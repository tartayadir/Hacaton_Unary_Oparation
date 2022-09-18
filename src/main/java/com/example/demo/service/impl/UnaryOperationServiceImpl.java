package com.example.demo.service.impl;

import com.example.demo.entity.MathOperation;
import com.example.demo.entity.UnaryOperation;
import com.example.demo.repository.UnaryOperationRepository;
import com.example.demo.service.UnaryOperationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import static java.math.BigInteger.*;
import java.math.BigInteger;
import java.math.MathContext;

@Service
@AllArgsConstructor
public class UnaryOperationServiceImpl implements UnaryOperationService {

    private static final MathContext mathContext = new MathContext(10);

    private final UnaryOperationRepository unaryOperationRepository;

    @Override
    public void saveEntity(UnaryOperation unaryOperation) {

        unaryOperation.setNumber(unaryOperation.getNumber());
        unaryOperationRepository.save(unaryOperation);
    }

    @Override
    public String calculateResult(UnaryOperation unaryOperation){

        double number = Double.parseDouble(unaryOperation.getNumber());
        BigDecimal bigDecimal = BigDecimal.valueOf(number);
        MathOperation mathOperation = unaryOperation.getMathOperation();

        BigDecimal result = switch (mathOperation){
            case ABS -> abs(bigDecimal);
            case SQRT -> sqrt(bigDecimal);
            case FACTORIAL -> factorial(bigDecimal);
            case X_DIVIDE_ONE -> numberDividedByOne(bigDecimal);
            case POW -> pow(bigDecimal);
        };

        unaryOperation.setResult(result.toString());
        return result.toString();
    }

    @Override
    public BigDecimal sqrt(BigDecimal number) {

        return number.sqrt(mathContext);
    }

    @Override
    public BigDecimal factorial(BigDecimal number) {

        BigInteger factorial = ONE;
        for (BigInteger i = ONE;
             i.compareTo(number.toBigInteger()) <= 0;
             i = i.add(ONE)) {
            factorial = factorial.multiply(i);
        }
        return new BigDecimal(factorial);
    }

    @Override
    public BigDecimal abs(BigDecimal number) {
        return number.abs();
    }

    @Override
    public BigDecimal numberDividedByOne(BigDecimal number) {

        return BigDecimal.ONE.divide(number, mathContext);
    }

    @Override
    public BigDecimal pow(BigDecimal number) {
        return number.multiply(number);
    }
}
