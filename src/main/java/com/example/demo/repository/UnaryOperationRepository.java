package com.example.demo.repository;

import com.example.demo.entity.UnaryOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnaryOperationRepository extends JpaRepository<UnaryOperation, Long> {


}
