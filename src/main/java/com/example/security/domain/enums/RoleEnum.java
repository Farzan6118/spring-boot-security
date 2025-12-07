package com.example.security.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum RoleEnum {

    USER("user", List.of(Permission.READ_LEVEL_ONE, Permission.READL2)),
    ADMIN("admin", List.of(Permission.READ_LEVEL_ONE, Permission.READL2, Permission.WRITEL1, Permission.WRITEL2)),
    MANAGER("ManagerEntity", List.of(Permission.READ_LEVEL_ONE, Permission.READL2, Permission.WRITEL1, Permission.WRITEL2, Permission.EDITL1, Permission.READL2));

    private final String value;
    private final List<Permission> permission;

}
