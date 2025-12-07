package com.example.security.service;

import com.example.security.controller.dto.request.ManagerRequestDto;
import com.example.security.controller.dto.response.ManagerResponseDto;

import java.util.List;

public interface ManagerService {

    ManagerResponseDto save(ManagerRequestDto dto);

    List<ManagerResponseDto> findAll();

    ManagerResponseDto findById(Long id);

    void deleteById(Long id);
}
