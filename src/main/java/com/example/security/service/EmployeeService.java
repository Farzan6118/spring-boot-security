package com.example.security.service;

import com.example.security.controller.dto.request.EmployeeRequestDto;
import com.example.security.controller.dto.response.EmployeeResponseDto;

import java.util.List;

public interface EmployeeService {
    EmployeeResponseDto save(EmployeeRequestDto dto);

    List<EmployeeResponseDto> findAll();

    EmployeeResponseDto findById(Long id);

    void deleteById(Long id);
}
