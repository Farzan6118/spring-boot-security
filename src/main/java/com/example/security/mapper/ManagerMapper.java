package com.example.security.mapper;

import com.example.security.controller.dto.request.ManagerRequestDto;
import com.example.security.controller.dto.response.ManagerResponseDto;
import com.example.security.domain.entity.ManagerEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagerMapper {
    ManagerEntity toEntity(ManagerRequestDto dto);

    ManagerResponseDto toDto(ManagerEntity entity);

    List<ManagerResponseDto> toDtoList(List<ManagerEntity> productList);
}