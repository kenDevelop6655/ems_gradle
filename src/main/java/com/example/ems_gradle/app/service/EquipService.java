package com.example.ems_gradle.app.service;
import com.example.ems_gradle.infra.mbgMapper.ems.ManageEquipMapper;
import com.example.ems_gradle.infra.mbgModel.ems.ManageEquip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EquipService {

    @Autowired
    ManageEquipMapper manageEquipMapper;

    public void insertEquip(ManageEquip equip){
        manageEquipMapper.insert(equip);
    }
}
