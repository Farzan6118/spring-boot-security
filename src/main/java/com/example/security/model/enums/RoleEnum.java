package com.example.security.model.enums;

import java.util.List;

public enum RoleEnum {

    USER("user", List.of(Permission.READL1, Permission.READL2)),
    ADMIN("admin", List.of(Permission.READL1, Permission.READL2, Permission.WRITEL1, Permission.WRITEL2)),
    MANAGER("manager", List.of(Permission.READL1, Permission.READL2, Permission.WRITEL1, Permission.WRITEL2, Permission.EDITL1, Permission.READL2));

    private final String value;
    private final List<Permission> permission;

    RoleEnum(String value, List<Permission> permission) {
        this.value = value;
        this.permission = permission;
    }
}
