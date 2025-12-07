package com.example.security.mapper;

import com.example.security.controller.dto.request.EmployeeRequestDto;
import com.example.security.controller.dto.response.EmployeeResponseDto;
import com.example.security.domain.entity.EmployeeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeEntity toEntity(EmployeeRequestDto dto);

    EmployeeResponseDto toDto(EmployeeEntity entity);

    List<EmployeeResponseDto> toDtoList(List<EmployeeEntity> employeeEntityList);
}