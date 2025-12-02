package com.example.security.controller;

import com.example.security.controller.dto.request.EmployeeRequestDto;
import com.example.security.controller.dto.response.EmployeeResponseDto;
import com.example.security.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> saveEmployee(@RequestBody EmployeeRequestDto dto) {
        return ResponseEntity.ok(employeeService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> findAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<EmployeeResponseDto> findEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.findById(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<EmployeeResponseDto> deleteEmployeeById(@PathVariable Long id) {
        employeeService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

}
