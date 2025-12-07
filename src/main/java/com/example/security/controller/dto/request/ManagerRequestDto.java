package com.example.security.controller.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ManagerRequestDto {
    private String firstName;
    private String lastName;
    private String NationalCode;
    private String role;
}
