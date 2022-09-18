package com.example.demo.controller;

import com.example.demo.entity.UnaryOperation;
import com.example.demo.entity.MathOperation;
import com.example.demo.service.UnaryOperationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unary")
@AllArgsConstructor
public class UnaryOperationController {

    private final UnaryOperationService unaryOperationService;

    @GetMapping
    public String m(@RequestParam("number1") String number1, String operation){

        MathOperation mathOperation = MathOperation.getOperation(operation);
        UnaryOperation binaryOperation = new UnaryOperation(number1, mathOperation);
        unaryOperationService.saveEntity(binaryOperation);

        return String.format("Sum = %d", binaryOperation.getResult());
    }
}
