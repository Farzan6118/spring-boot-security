package com.example.security.mapper;

import com.example.security.controller.dto.request.EmployeeRequestDto;
import com.example.security.controller.dto.response.EmployeeResponseDto;
import com.example.security.domain.entity.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface employeeMapper {
    Employee toEntity(EmployeeRequestDto dto);

    EmployeeResponseDto toDto(Employee entity);

    List<EmployeeResponseDto> toDtoList(List<Employee> employeeList);
}