package com.example.security.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RecordStatus {
    ACTIVE,
    INACTIVE,
    DELETED,
}
