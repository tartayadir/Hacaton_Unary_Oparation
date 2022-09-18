package com.example.demo.service.impl;

import com.example.demo.entity.UnaryOperation;
import com.example.demo.repository.UnaryOperationRepository;
import com.example.demo.service.UnaryOperationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UnaryOperationServiceImpl implements UnaryOperationService {

    private final UnaryOperationRepository unaryOperationRepository;

    @Override
    public void saveEntity(UnaryOperation binaryOperation) {

        binaryOperation.setFirstNumber(binaryOperation.getFirstNumber());
        binaryOperation.setSecondNumber(binaryOperation.getSecondNumber());
        unaryOperationRepository.save(binaryOperation);

    }
}
