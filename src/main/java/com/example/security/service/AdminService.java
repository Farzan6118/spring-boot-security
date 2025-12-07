package com.example.security.service;

import com.example.security.controller.dto.request.AdminRequestDto;
import com.example.security.controller.dto.response.AdminResponseDto;

import java.util.List;

public interface AdminService {

    AdminResponseDto save(AdminRequestDto dto);

    List<AdminResponseDto> findAll();

    AdminResponseDto findById(Long id);

    void deleteById(Long id);
}
