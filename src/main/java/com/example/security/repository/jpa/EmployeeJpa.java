package com.example.security.repository.jpa;

import com.example.security.domain.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpa extends JpaRepository<EmployeeEntity, Long> {
}
