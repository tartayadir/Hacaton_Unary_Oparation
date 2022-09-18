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
    public String getResult(@RequestParam("number") String number, @RequestParam("operation") String operation){

        MathOperation mathOperation = MathOperation.getOperation(operation);
        UnaryOperation unaryOperation = new UnaryOperation(number, mathOperation);

        String result = unaryOperationService.calculateResult(unaryOperation);
        unaryOperationService.saveEntity(unaryOperation);

        return result;
    }
}
