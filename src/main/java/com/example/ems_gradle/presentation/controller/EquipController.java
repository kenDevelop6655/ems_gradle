package com.example.ems_gradle.presentation.controller;

import com.example.ems_gradle.app.service.EquipService;
import com.example.ems_gradle.domain.dto.AddDto;
import com.example.ems_gradle.domain.dto.DeleteDto;
import com.example.ems_gradle.domain.dto.EditDto;
import com.example.ems_gradle.domain.enums.EquipType;
import com.example.ems_gradle.domain.mbgModel.ems.Equip;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("equip")
public class EquipController {

    private final EquipService equipService;
    private final ModelMapper modelMapper;

    @Autowired
    public EquipController(
            EquipService equipService,
            ModelMapper modelMapper
    ){
        this.equipService=equipService;
        this.modelMapper = modelMapper;
    }


    //一覧ページの表示
    @RequestMapping("")
    String home(Model model){
        List<Equip> equipList = new ArrayList<>();
        equipList = equipService.findAll();
        model.addAttribute("title","備品一覧");
        model.addAttribute("equipList",equipList);
        return "home";
    }



    //備品の追加画面の表示
    @RequestMapping("addForm")
    String addForm(Model model){
        AddDto addDto = new AddDto();
        model.addAttribute("title","備品登録画面");
        model.addAttribute("addDto",addDto);
        model.addAttribute("equipTypeList", EquipType.values());
        return "add_form";
    }

    //備品の追加
    @RequestMapping("add")
    String insertEquip(
            @Validated AddDto addDto,
            BindingResult bindingResult,
            Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("title","備品登録画面");
            model.addAttribute("equipTypeList", EquipType.values());
            return "add_form";
        }
        model.addAttribute("title","完了画面");
        equipService.insertEquip(addDto);
        return "complete";
    }


    //詳細画面の表示
    @RequestMapping(path = "", params = {"id"})
    String detail(
            @RequestParam("id") int id,
            Model model){
        Equip equip = equipService.selectById(id);
        EditDto editDto = modelMapper.map(equip,EditDto.class);
        model.addAttribute("title","詳細画面");
        model.addAttribute("editDto",editDto);
        model.addAttribute("id",id);
        return "detail";
    }


    //備品の編集
    @RequestMapping(path="edit", params = {"id"})
    String insertEquip(
            @RequestParam("id") int id,
            @Validated EditDto editDto,
            BindingResult bindingResult,
            Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("title","備品編集画面");
            model.addAttribute("equipTypeList", EquipType.values());
            model.addAttribute("id",id);
            return "detail";
        }
        model.addAttribute("title","完了画面");
        equipService.editEquip(id,editDto);
        return "complete";
    }

    //備品の削除
    @RequestMapping(path = "delete", params = {"id"})
    String deleteEquip(
            Model model,
            DeleteDto deleteDto,
            @RequestParam("id") int id
    ){
        equipService.deleteById(id,deleteDto);
        return "redirect:/equip";
    }
}
