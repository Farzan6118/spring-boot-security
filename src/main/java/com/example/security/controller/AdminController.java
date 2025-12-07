package com.example.security.controller;

import com.example.security.controller.dto.request.AdminRequestDto;
import com.example.security.controller.dto.response.AdminResponseDto;
import com.example.security.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/admin")
public class AdminController {

    private final AdminService adminService;

    @GetMapping("{id}")
    public ResponseEntity<AdminResponseDto> findAdminById(@PathVariable Long id) {
        return ResponseEntity.ok(adminService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<AdminResponseDto>> findAllAdmins() {
        return ResponseEntity.ok(adminService.findAll());
    }

    @PostMapping
    public ResponseEntity<AdminResponseDto> saveAdmin(@RequestBody AdminRequestDto dto) {
        return ResponseEntity.ok(adminService.save(dto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteAdminById(@PathVariable Long id) {
        adminService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

}
