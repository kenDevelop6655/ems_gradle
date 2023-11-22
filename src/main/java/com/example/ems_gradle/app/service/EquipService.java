package com.example.ems_gradle.app.service;

import com.example.ems_gradle.domain.dto.AddDto;
import com.example.ems_gradle.domain.dto.DeleteDto;
import com.example.ems_gradle.domain.dto.EditDto;
import com.example.ems_gradle.domain.mbgModel.ems.*;
import com.example.ems_gradle.infra.mbgMapper.ems.AddMapper;
import com.example.ems_gradle.infra.mbgMapper.ems.DeleteMapper;
import com.example.ems_gradle.infra.mbgMapper.ems.EditMapper;
import com.example.ems_gradle.infra.mbgMapper.ems.EquipMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class EquipService {

    private final EquipMapper equipMapper;
    private final AddMapper addMapper;
    private final EditMapper editMapper;
    private final DeleteMapper deleteMapper;
    private final ModelMapper modelMapper;

    @Autowired
    public EquipService(
            EquipMapper equipMapper,
            AddMapper addMapper,
            EditMapper editMapper,
            DeleteMapper deleteMapper,
            ModelMapper modelMapper
    ){
        this.equipMapper = equipMapper;
        this.addMapper = addMapper;
        this.editMapper = editMapper;
        this.deleteMapper = deleteMapper;
        this.modelMapper = modelMapper;
    }


    //備品の一覧を返す
    public List<Equip> findAll(){
        EquipExample equipExample = new EquipExample();
        return equipMapper.selectByExample(equipExample);
    }

    //備品を追加する
    public void insertEquip(AddDto addDto){
        //Equipテーブルに追加
        Equip equip = modelMapper.map(addDto,Equip.class);
        equipMapper.insert(equip);
        int id = equip.getEquipId();
        //Addテーブルに追加
        Add add = new Add();
        Date now = new Date();
        add.setEquipId(id);
        add.setAddDate(now);
        add.setAddUserId(1);
        addMapper.insert(add);
    }

    //idによって備品を編集
    public void editEquip(int id,EditDto editDto){
        //Equipテーブルを更新
        Equip equip = modelMapper.map(editDto,Equip.class);
        equip.setEquipId(id);
        equipMapper.updateByPrimaryKey(equip);
        //Editテーブルに追加
        Edit edit = new Edit();
        Date now = new Date();
        edit.setEditDate(now);
        edit.setEditEmpId(1);
        editMapper.insert(edit);
    }

    //idによって備品を取得
    public Equip selectById(int id){
        return equipMapper.selectByPrimaryKey(id);
    }


    //idによって備品を削除
    public void deleteById(int id, DeleteDto deleteDto) {
        //Equipテーブルから削除
        equipMapper.deleteByPrimaryKey(id);
        //Deleteテーブルから登録
        Delete delete = new Delete();
        Date now = new Date();
        delete.setNote(deleteDto.getNote());
        delete.setDeleteEmpId(1);
        delete.setEquipId(id);
        delete.setDeleteDate(now);
        deleteMapper.insert(delete);
    }
}
