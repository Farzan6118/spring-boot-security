package com.example.security.controller;

import com.example.security.controller.dto.request.ManagerRequestDto;
import com.example.security.controller.dto.response.ManagerResponseDto;
import com.example.security.service.ManagerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/manager")
public class ManagerController {

    private final ManagerService managerService;

    @GetMapping("{id}")
    public ResponseEntity<ManagerResponseDto> findManagerById(@PathVariable Long id) {
        return ResponseEntity.ok(managerService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ManagerResponseDto>> findAllManagers() {
        return ResponseEntity.ok(managerService.findAll());
    }

    @PostMapping
    public ResponseEntity<ManagerResponseDto> saveManager(@RequestBody ManagerRequestDto dto) {
        return ResponseEntity.ok(managerService.save(dto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteManagerById(@PathVariable Long id) {
        managerService.deleteById(id);
        return ResponseEntity.notFound().build();
    }

}
