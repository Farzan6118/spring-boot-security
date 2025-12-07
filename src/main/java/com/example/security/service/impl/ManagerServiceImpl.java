package com.example.security.service.impl;

import com.example.security.controller.dto.request.ManagerRequestDto;
import com.example.security.controller.dto.response.ManagerResponseDto;
import com.example.security.domain.entity.ManagerEntity;
import com.example.security.mapper.ManagerMapper;
import com.example.security.repository.jpa.ManagerJpa;
import com.example.security.service.ManagerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    private final ManagerMapper managerMapper;
    private final ManagerJpa managerJpa;

    public ManagerServiceImpl(ManagerMapper managerMapper, ManagerJpa managerJpa) {
        this.managerMapper = managerMapper;
        this.managerJpa = managerJpa;
    }


    @Override
    public ManagerResponseDto save(ManagerRequestDto dto) {
        ManagerEntity ManagerEntity = managerMapper.toEntity(dto);
        ManagerEntity save = managerJpa.save(ManagerEntity);
        return managerMapper.toDto(save);
    }

    @Override
    public List<ManagerResponseDto> findAll() {
        List<ManagerEntity> managerEntityList = managerJpa.findAll();
        return managerMapper.toDtoList(managerEntityList);
    }

    @Override
    public ManagerResponseDto findById(Long id) {
        ManagerEntity ManagerEntity = managerJpa.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ManagerEntity not found"));
        return managerMapper.toDto(ManagerEntity);
    }

    @Override
    public void deleteById(Long id) {

    }
}
