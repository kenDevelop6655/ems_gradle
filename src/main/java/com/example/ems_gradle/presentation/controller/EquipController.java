package com.example.ems_gradle.presentation.controller;

import com.example.ems_gradle.app.service.EquipService;
import com.example.ems_gradle.domain.mbgModel.ems.EquipType;
import com.example.ems_gradle.domain.mbgModel.ems.ManageEquip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("equip")
public class EquipController {

    @Autowired
    EquipService equipService;



    //一覧ページの表示
    @RequestMapping("")
    String home(Model model){
        model.addAttribute("sample","sample");
        return "home";
    }

    //管理備品の追加画面の表示
    @RequestMapping("addForm")
    String addForm(Model model){
        EquipType equipType = new EquipType();
        ManageEquip manageSample = new ManageEquip();
        List<EquipType> equipTypeList = equipService.findAllType();
        model.addAttribute("equipForm",manageSample);
        model.addAttribute("equipType",equipType);
        model.addAttribute("equipTypeList",equipTypeList);
        return "add_form";
    }

    //管理備品の追加
    @RequestMapping("add")
    String insertEquip(
            @Validated ManageEquip manageEquip,
            BindingResult bindingResult,
            Model model){
        equipService.insertEquip(manageEquip);
        return "home";
    }


}
