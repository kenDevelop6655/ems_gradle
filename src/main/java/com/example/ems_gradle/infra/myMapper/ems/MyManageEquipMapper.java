package com.example.ems_gradle.infra.myMapper.ems;

import com.example.ems_gradle.domain.mbgModel.ems.ManageEquip;

import java.util.List;

public interface MyManageEquipMapper {

    List<ManageEquip> findAll();
}
