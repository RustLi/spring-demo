package com.example.test.manager;

import com.example.test.manager.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManagerApplicationTests {

    @Autowired
    private TestService testService;
    @Test
    void contextLoads() {
    }

    @Test
    void serialTest(){
        testService.serialTest();
    }
}
