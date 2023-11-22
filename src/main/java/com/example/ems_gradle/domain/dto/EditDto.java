package com.example.ems_gradle.domain.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class EditDto {

    private Integer equipId;

    private Integer equipTypeId;

    private Integer ownerId;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date purchaseDate;

    private String equipManageCode;

    private String equipName;

    private String location;

    private String note;
}
