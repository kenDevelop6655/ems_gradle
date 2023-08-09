package com.example.ems_gradle.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DiscriminateTable {
    MANAGE_EQUIP("0", "管理テーブル"),
    REQUEST_EQUIP("1", "購入依頼テーブル");

    private final String value;
    private final String label;
}
