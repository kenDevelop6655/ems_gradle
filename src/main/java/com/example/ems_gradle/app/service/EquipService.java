package com.example.ems_gradle.app.service;
import com.example.ems_gradle.domain.mbgModel.ems.EquipType;
import com.example.ems_gradle.domain.mbgModel.ems.EquipTypeExample;
import com.example.ems_gradle.infra.mbgMapper.ems.EquipTypeMapper;
import com.example.ems_gradle.infra.mbgMapper.ems.ManageEquipMapper;
import com.example.ems_gradle.domain.mbgModel.ems.ManageEquip;
import com.example.ems_gradle.infra.myMapper.ems.MyManageEquipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EquipService {

    @Autowired
    ManageEquipMapper manageEquipMapper;
    MyManageEquipMapper myManageEquipMapper;
    @Autowired
    EquipTypeMapper equipTypeMapper;


    //管理備品の一覧を返す
    public List<ManageEquip> findAll(){
        List<ManageEquip> equipList = myManageEquipMapper.findAll();
        return equipList;
    }

    //管理備品を追加する
    public void insertEquip(ManageEquip equip){
        manageEquipMapper.insertSelective(equip);
    }

    //備品タイプの一覧を返す
    public List<EquipType> findAllType(){
        EquipTypeExample equipTypeExample = new EquipTypeExample();
        equipTypeExample.setOrderByClause("equip_type_id");
        return  equipTypeMapper.selectByExample(equipTypeExample);
    }
}
