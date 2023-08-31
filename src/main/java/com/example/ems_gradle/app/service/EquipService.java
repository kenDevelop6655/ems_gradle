package com.example.ems_gradle.app.service;

import com.example.ems_gradle.domain.mbgModel.ems.Equip;
import com.example.ems_gradle.domain.mbgModel.ems.EquipExample;
import com.example.ems_gradle.infra.mbgMapper.ems.EquipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EquipService {

    private final EquipMapper equipMapper;

    @Autowired
    public EquipService(
            EquipMapper equipMapper
    ){
        this.equipMapper=equipMapper;
    }


    //備品の一覧を返す
    public List<Equip> findAll(){
        EquipExample equipExample = new EquipExample();
        return equipMapper.selectByExample(equipExample);
    }

    //備品を追加する
    public void insertEquip(Equip equip){
        equipMapper.insert(equip);
    }

    //idによって備品を取得
    public Equip selectById(int id){
        return equipMapper.selectByPrimaryKey(id);
    }

    //idによって備品を削除
    public void deleteById(int id){
        equipMapper.deleteByPrimaryKey(id);
    }
}
