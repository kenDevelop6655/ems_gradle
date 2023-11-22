package com.example.ems_gradle.domain.dto;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
public class AddDto {

    private Integer equipTypeId;


    private Integer ownerId;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date purchaseDate;

    private String equipManageCode;


    private String equipName;

    private String location;


    private String note;

}
