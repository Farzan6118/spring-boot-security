package com.example.security.repository.jpa;

import com.example.security.domain.entity.ManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerJpa extends JpaRepository<ManagerEntity, Long> {
}
