package com.example.security.service.impl;

import com.example.security.controller.dto.request.AdminRequestDto;
import com.example.security.controller.dto.response.AdminResponseDto;
import com.example.security.domain.entity.AdminEntity;
import com.example.security.mapper.AdminMapper;
import com.example.security.repository.jpa.AdminJpa;
import com.example.security.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    private final AdminMapper mapper;
    private final AdminJpa jpa;

    public AdminServiceImpl(AdminMapper mapper, AdminJpa jpa) {
        this.mapper = mapper;
        this.jpa = jpa;
    }


    @Override
    public AdminResponseDto save(AdminRequestDto dto) {
        AdminEntity AdminEntity = mapper.toEntity(dto);
        AdminEntity save = jpa.save(AdminEntity);
        return mapper.toDto(save);
    }

    @Override
    public List<AdminResponseDto> findAll() {
        List<AdminEntity> managerEntityList = jpa.findAll();
        return mapper.toDtoList(managerEntityList);
    }

    @Override
    public AdminResponseDto findById(Long id) {
        AdminEntity AdminEntity = jpa.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "AdminEntity not found"));
        return mapper.toDto(AdminEntity);
    }

    @Override
    public void deleteById(Long id) {

    }
}
