package com.example.security.service.impl;

import com.example.security.controller.dto.request.EmployeeRequestDto;
import com.example.security.controller.dto.response.EmployeeResponseDto;
import com.example.security.domain.entity.Employee;
import com.example.security.mapper.employeeMapper;
import com.example.security.repository.jpa.EmployeeJpa;
import com.example.security.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeJpa employeeJpa;
    private final employeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeJpa employeeJpa, employeeMapper employeeMapper) {
        this.employeeJpa = employeeJpa;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public EmployeeResponseDto save(EmployeeRequestDto dto) {
        Employee employee = employeeMapper.toEntity(dto);
        Employee save = employeeJpa.save(employee);
        return employeeMapper.toDto(save);
    }

    @Override
    public List<EmployeeResponseDto> findAll() {
        List<Employee> employeeList = employeeJpa.findAll();
        return employeeMapper.toDtoList(employeeList);
    }

    @Override
    public EmployeeResponseDto findById(Long id) {
        Employee employee = employeeJpa.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));
        return employeeMapper.toDto(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeJpa.deleteById(id);
    }

}
