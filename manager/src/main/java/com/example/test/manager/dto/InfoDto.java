package com.example.test.manager.dto;

import lombok.Data;

@Data
public class InfoDto {
    private String name;
    private String remark;
    private SubInfoDto subInfoDto;
}
