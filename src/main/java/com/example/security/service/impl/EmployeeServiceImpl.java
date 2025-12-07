package com.example.security.service.impl;

import com.example.security.controller.dto.request.EmployeeRequestDto;
import com.example.security.controller.dto.response.EmployeeResponseDto;
import com.example.security.domain.entity.EmployeeEntity;
import com.example.security.mapper.EmployeeMapper;
import com.example.security.repository.jpa.EmployeeJpa;
import com.example.security.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeJpa employeeJpa;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeJpa employeeJpa, EmployeeMapper employeeMapper) {
        this.employeeJpa = employeeJpa;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public EmployeeResponseDto save(EmployeeRequestDto dto) {
        EmployeeEntity employeeEntity = employeeMapper.toEntity(dto);
        EmployeeEntity save = employeeJpa.save(employeeEntity);
        return employeeMapper.toDto(save);
    }

    @Override
    public List<EmployeeResponseDto> findAll() {
        List<EmployeeEntity> employeeEntityList = employeeJpa.findAll();
        return employeeMapper.toDtoList(employeeEntityList);
    }

    @Override
    public EmployeeResponseDto findById(Long id) {
        EmployeeEntity employeeEntity = employeeJpa.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "EmployeeEntity not found"));
        return employeeMapper.toDto(employeeEntity);
    }

    @Override
    public void deleteById(Long id) {
        employeeJpa.deleteById(id);
    }

}
