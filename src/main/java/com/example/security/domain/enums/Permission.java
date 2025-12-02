package com.example.security.domain.enums;

public enum Permission {

    READ_LEVEL_ONE("read1"),
    WRITEL1("write1"),
    EDITL1("edit1"),
    READL2("read2"),
    WRITEL2("write2"),
    EDITL2("edit1");
    final String value;

    Permission(String value) {
        this.value = value;
    }
}
