package com.example.ems_gradle.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

    @AllArgsConstructor
    @Getter
    public enum Role {
        ADMIN("0", "管理者"),
        USER("1", "ユーザ");

        private final String value;
        private final String label;

}
