package com.example.security.controller.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String NationalCode;
}
