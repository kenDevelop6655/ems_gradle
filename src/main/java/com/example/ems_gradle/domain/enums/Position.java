package com.example.ems_gradle.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Position {
    GENERAL("0", "一般社員"),
    CHIEF("1", "課長"),
    MANAGER("2", "部長");

    private final String value;
    private final String label;
}
