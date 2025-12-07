package com.example.security.controller.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminRequestDto {
    private String firstName;
    private String lastName;
    private String NationalCode;
    private String role;
}
