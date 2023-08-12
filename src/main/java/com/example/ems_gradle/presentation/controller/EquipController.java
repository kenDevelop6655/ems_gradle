package com.example.ems_gradle.presentation.controller;

import com.example.ems_gradle.app.service.EquipService;
import com.example.ems_gradle.infra.mbgModel.ems.ManageEquip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("equip")
public class EquipController {

    @Autowired
    EquipService equipService;

    ManageEquip manageSample = new ManageEquip();



    @RequestMapping("insert")
    String insertEquip(Model model){
        manageSample.setEquipId(1);
        manageSample.setEquipName("PC");
        equipService.insertEquip(manageSample);
        return "home";
    }


}
