package com.example.test.manager.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.test.manager.dto.InfoDto;
import com.example.test.manager.dto.SubInfoDto;
import com.example.test.manager.dto.TestParam;
import com.example.test.manager.dto.TestReqDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements TestService {
    @Override
    public void test(TestReqDto reqDto) {
        log.info("test: reqDto:{}", reqDto);
        TestParam param = reqDto.toParam();
        log.info("test: param = " + param);
    }

    @Override
    public void serialTest() {
        InfoDto dto = new InfoDto();
        dto.setName("111");
        dto.setRemark("hhh");
        SubInfoDto subInfoDto = new SubInfoDto();
        subInfoDto.setName("subName");
        subInfoDto.setRemark("subRemark");
        dto.setSubInfoDto(subInfoDto);

        String dtoStr = JSON.toJSONString(dto);
        log.info("dtoStr = {}", dtoStr);

        //测试多个字段接收，字段为空，其他正常
        //SubInfoDto: respDto = SubInfoDto(name=111, remark=hhh, alias=null)
        SubInfoDto respDto = JSONObject.parseObject(dtoStr, SubInfoDto.class);
        log.info("SubInfoDto: respDto = {}", respDto);

        //测试包含对象时，反序列化
        //SubInfoDto: respDto1 = InfoDto(name=111, remark=hhh, subInfoDto=SubInfoDto(name=subName, remark=subRemark, alias=null))
        InfoDto respDto1 = JSONObject.parseObject(dtoStr, InfoDto.class);
        log.info("SubInfoDto: respDto1 = {}", respDto1);

    }

    public static void main(String[] args) {
        System.out.println(111);
        TestServiceImpl testService = new TestServiceImpl();
        testService.serialTest();
        System.out.println(222);
    }
}
