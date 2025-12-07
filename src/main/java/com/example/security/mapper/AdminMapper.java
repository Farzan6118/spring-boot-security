package com.example.security.mapper;

import com.example.security.controller.dto.request.AdminRequestDto;
import com.example.security.controller.dto.response.AdminResponseDto;
import com.example.security.domain.entity.AdminEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdminMapper {
    AdminEntity toEntity(AdminRequestDto dto);

    AdminResponseDto toDto(AdminEntity entity);

    List<AdminResponseDto> toDtoList(List<AdminEntity> productList);
}