package com.example.security.controller.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {
    private String name;
    private String code;
}
