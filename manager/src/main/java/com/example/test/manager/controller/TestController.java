package com.example.test.manager.controller;

import com.example.test.manager.dto.TestReqDto;
import com.example.test.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/update.json")
    public void update(@RequestBody TestReqDto reqDto){
        testService.test(reqDto);
    }
}
