package com.example.test.manager.service;

import com.example.test.manager.dto.TestReqDto;

public interface TestService {
    void test(TestReqDto reqDto);

    /**
     * 序列化测试
     **/
    void serialTest();
}
