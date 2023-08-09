package com.example.ems_gradle.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CheckStatus {
    OK("0", "確認済"),
    UNCONFIRMED("1", "未確認"),
    NG("2", "問題有り");

    private final String value;
    private final String label;
}
