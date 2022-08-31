package com.example.test.manager.dto;

import lombok.Data;

import java.util.List;

@Data
public class TestReqDto {
    private List<InfoDto> dtoList;

    public TestParam toParam(){
        TestParam param = new TestParam();
        param.setDtoList(dtoList);
        return param;
    }
}
