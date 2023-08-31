package com.example.ems_gradle.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    GENERAL("1", "一般ユーザ"),
    ADMIN("2", "管理者");

    private final String value;
    private final String label;
}
