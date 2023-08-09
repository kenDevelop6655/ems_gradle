package com.example.ems_gradle.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OperationType {
    ADD("0", "追加"),
    CHANGE("1", "変更"),
    DELETE("2", "削除");

    private final String value;
    private final String label;
}