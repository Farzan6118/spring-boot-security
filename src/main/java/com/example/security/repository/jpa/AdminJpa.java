package com.example.security.repository.jpa;

import com.example.security.domain.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJpa extends JpaRepository<AdminEntity, Long> {
}
